import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {

        ServerSocket serverSocket = null; // 포트번호 4000으로 서버소켓 생성

        try {
            serverSocket = new ServerSocket(4000);
            System.out.println("클라이언트의 연결을 기다리는 중..");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 클라이언트에서 연결 시도후의 코드 작성

        while (true) {
            try {
                // 클라이언트의 요청 accept 후 통신할 소켓 생성
                Socket socket = serverSocket.accept();
                System.out.println("클라이언트 연결 성공!");

                InputStream in = socket.getInputStream();
                DataInputStream dis = new DataInputStream(in);
                String msg = dis.readUTF();

                OutputStream out = socket.getOutputStream();
                DataOutputStream dos = new DataOutputStream(out);
                dos.writeUTF("서버 : " + msg);
                dos.close();
                dis.close();
                socket.close();
                System.out.println("소켓 닫음");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
