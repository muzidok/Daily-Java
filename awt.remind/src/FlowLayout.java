import javax.swing.*;
import java.awt.*;

public class FlowLayout extends JFrame {

    // JFram을  상속받아 만든다.
    FlowLayout(){
        super("java"); // 제목 설정
        setVisible(true); // 프레임 출력 메소드

        JButton j1 = new JButton("버튼1");
        JButton j2 = new JButton("버튼2");
        JButton j3 = new JButton("버튼3");

        Container con = getContentPane(); // 컨텐트팬 알아내기
        con.add(j1); // 컨텐트 팬에 버튼 붙이기
        con.add(j2);
        con.add(j3);

        con.setLayout(new java.awt.FlowLayout()); // 배치관리자 순서대로 배치
    }

    public static void main(String[] args) {
        new FlowLayout(); // 생성자 호출
    }
}
