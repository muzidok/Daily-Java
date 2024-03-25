import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class ChatServer {
    HashMap clients;

    ChatServer() {
        clients = new HashMap();
        Collections.synchronizedMap(clients);
    }

    public void start() {
        ServerSocket serverSocket = null;
        Socket socket = null;
        try {
            serverSocket = new ServerSocket(4000);
            System.out.println("서버 기다림");
            while (true) {
                socket = serverSocket.accept();
                System.out.println(socket.getInetAddress() + ":" +
                        socket.getPort() + " connect!");
                ServerReceiver thread = new ServerReceiver(socket); //아직 아래에 안만들어서 에러가 뜬다.
                thread.start(); // run()
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void sendAll(String msg) {//브로드캐스팅 기능
        Iterator iterator = clients.keySet().iterator();
        while (iterator.hasNext()) {
            try {
                DataOutputStream out =
                        (DataOutputStream) clients.get(iterator.next());
                out.writeUTF(msg);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    class ServerReceiver extends Thread {
        Socket socket;
        DataInputStream in;
        DataOutputStream out;

        ServerReceiver(Socket socket) throws IOException {
            this.socket = socket;
            try{
                in = new DataInputStream(socket.getInputStream());
                out = new DataOutputStream((socket.getOutputStream()));
            }catch(Exception e){
                e.printStackTrace();
            }
        }

        public void run(){
            String name = "";
            try{
                name = in.readUTF();

                if(clients.get(name) != null){ // 같은 사용자가 이미 존재한다면
                    out.writeUTF(name + "은 이미 존재하는 이름입니다. ");
                    out.writeUTF("다른이름으로 연결해주세요.");
                    System.out.println(socket.getInetAddress() + " : " + socket.getPort() + "DisConnected!");
                    in.close();
                    socket.close();
                    socket = null;
                }else{ // 같은이름이 존재하지 않는경우
                    sendAll("# "+ name + "입장");
                    clients.put(name, out);
                    while(in != null){
                        sendAll(in.readUTF());
                    }
                }
            }catch(Exception e) {
                e.printStackTrace();
            }finally{
                if(socket != null){
                    sendAll("# " + name + " exit!");
                    clients.remove(name);
                    System.out.println(socket.getInetAddress() +  " : " + socket.getPort() + " Disconnected!");
                }
            }
        }
    }

    public static void main(String[] args) {

        new ChatServer().start();
    }
}