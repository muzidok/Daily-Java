import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
public class ChatClient {
    public static void main(String[] args) throws IOException {
        try {
            Socket socket = new Socket("127.0.0.1", 4000);
            Scanner sc = new Scanner(System.in);
            System.out.println("이름 : ");
            String name = sc.nextLine();
            Thread sender = new Thread(new Sender(socket, name)); // Sender를 불러오지 못하는 이유는 아직 클래스를 만들지 않아서이다.
            Thread receiver = new Thread(new Receiver(socket));
            sender.start();
            receiver.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        //
        static class Sender extends Thread {
            Socket socket;
            DataOutputStream out;
            String name;

            Sender(Socket socket, String name){
                this.socket = socket;
                this.name = name;

                try{
                    out = new DataOutputStream(socket.getOutputStream());
                }catch(Exception e) {
                    e.printStackTrace();
                }
            }

            public void run() {
                Scanner sc = new Scanner(System.in);

                try {
                    if (out != null) {
                        out.writeUTF(name);
                    }
                    while (out != null) {
                        String msg = sc.nextLine();
                        if (msg.equals("stop")) {
                            break;
                        }
                        out.writeUTF(("(" + name + ") : " + msg));
                    }
                    out.close();
                    socket.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        static class Receiver extends Thread{
        Socket socket ;
        DataInputStream in;
            Receiver(Socket socket){
                this.socket = socket;

                try{
                    in = new DataInputStream(socket.getInputStream());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            public void run(){
                while(in != null){
                    try{
                        System.out.println(in.readUTF());
                    }catch(Exception e){
                        e.printStackTrace();
                        break;
                    }
                }
                try{
                    in.close();
                    socket.close();
                }catch(Exception e){
                    e.printStackTrace();
                }
        }

        }

    }

