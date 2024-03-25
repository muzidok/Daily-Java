import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.awt.*;
class MouseDrag extends MouseAdapter{
    public void mouseDragged (MouseEvent e){ //에러 표시가 없는데 드래그해도 색이 바뀌지않았는데 MouseDragged라고 써서였다.
        // https://docs.oracle.com/javase/8/docs/api/java/awt/event/MouseMotionListener.html
        Container con = (Container) e.getSource();
        // e.getSource()는 MouseEvenet 객체에서 호출되며, 이벤트가 발생한 소스를 반환한다.
        // 즉, 드래그 이벤트가 발생한 컴포넌트를 반환한다.
        con.setBackground(Color.yellow);
    }
    @Override
    public void mouseReleased(MouseEvent e){
        Container con = (Container) e.getSource();
        con.setBackground(Color.pink);
    }
}
public class DragEvent extends JFrame {
    DragEvent(){
        Container con = getContentPane();
        con.setLayout((new FlowLayout()));
        con.setBackground(Color.pink);

        setVisible(true);


        con.addMouseListener(new MouseDrag());
        con.addMouseMotionListener(new MouseDrag());
    }

    public static void main(String[] args){
        new DragEvent();
    }
}
