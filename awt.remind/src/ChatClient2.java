import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ChatClient2 {
    public static void main(String[] args) throws IOException {

        Socket soc = null;

        try{
            soc = new Socket();
            System.out.println("서버에 연결 요청중..");

            soc.connect(new InetSocketAddress("localhost", 4001));
            System.out.println("서버에 연결 성공!");

            // 전송 코드

            byte[] b = null;
            String msg = null;

            OutputStream os = soc.getOutputStream();
            msg = "Hi Server!";
            b = msg.getBytes("UTF-8");

            os.write(b);
            System.out.println("데이터 전송 성공");

            // 읽기 코드
            InputStream in = soc.getInputStream();
            b = new byte[100];
            int r = in.read(b);

            // 메시지의 바이트 배열을 읽는다.
            msg = new String(b, 0, r, "UTF-8");
            // 바이트 배열을 문자열로 바꾼다.
            System.out.println("데이터 받기 성공!");

            in.close();
            os.close();
            soc.close();


        } catch (IOException e){}
    }
}
