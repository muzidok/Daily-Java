import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventProcess extends JFrame {
    EventProcess() {
        Container con = getContentPane();
        con.setLayout(new FlowLayout());

        JButton j1 = new JButton("ok");
        JButton j2 = new JButton("cancel");

        con.add(j1);
        con.add(j2);
        setVisible(true);

        j1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ok");
            }
        });

        j2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                j2.setEnabled(false); // 버튼비활성화
            }
        });
    }
        public static void main(String[] args){
            new EventProcess();
        }
    }

