import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class FindSource implements ActionListener {
    @Override
    public  void actionPerformed (ActionEvent e){
        JButton jb = (JButton) e.getSource(); // 이벤트가 어디에서 발생했는지

        if(jb.getText().equals("클릭")){ // 이벱트가 발생한 버튼명
            jb.setText("click"); // 버튼명을 영어로 세팅
        } else{
            jb.setText("클릭");
        }
    }
}
public class ActionEventListener extends JFrame{
    ActionEventListener(){
        Container con = getContentPane();
        con.setLayout(new FlowLayout());

        JButton j1 = new JButton("클릭");

        con.add(j1);
        setVisible(true);

        j1.addActionListener(new FindSource());
    }

    public static void main(String[] args) {
        new ActionEventListener();
    }
}
