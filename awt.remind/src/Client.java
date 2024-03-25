import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {

            Socket socket = new Socket("127.0.0.1", 4000); // 서버에 연결 요청
            System.out.println("연결 성공!");

            Scanner sc = new Scanner(System.in);
            String msg = sc.nextLine(); //키보드로 메세지 입력

            // 데이터 전송하거나 읽어오기 위해 소켓이 필요!
            OutputStream out = socket.getOutputStream();
            DataOutputStream dos = new DataOutputStream(out);
            dos.writeUTF(msg);

            InputStream in = socket.getInputStream();
            DataInputStream dis = new DataInputStream(in);
            System.out.println(dis.readUTF());
            dis.close();
            dos.close();
            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
