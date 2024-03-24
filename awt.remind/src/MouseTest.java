import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.FlowLayout;

 class Mouse extends MouseAdapter { // MouseAdapter 클래스를 상속받아 이벤트를 처리하는 클래스
     // MouseAdapter는 MouseListner 인터페이스의 메서드를 구현한 추상 클래스라서 Overriding해서 사용해야한다.
    @Override
    public void mouseClicked(MouseEvent e){
        System.out.println("마우스 클릭");
    }
}

public class MouseTest{
    public static void main(String[] args) {

        JFrame j = new JFrame();
        j.setLayout(new FlowLayout());

        JButton j1 = new JButton("one");
        JButton j2 = new JButton("two");

        j.add(j1);
        j.add(j2);

        j.setVisible(true);

        // one버튼을 마우스로 클릭했을때  이벤트 처리
        j1.addMouseListener(new Mouse());
    }
}

