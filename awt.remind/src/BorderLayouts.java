import javax.swing.*;
import java.awt.*;

public class BorderLayouts {
    public static void main(String[] args) {
        JFrame j = new JFrame();

        j.setLayout(new BorderLayout());

        j.add(new Button("동"), BorderLayout.EAST);
        j.add(new Button("서"), BorderLayout.WEST);
        j.add(new Button("남"), BorderLayout.SOUTH);
        j.add(new Button("북"), BorderLayout.NORTH);
        j.add(new Button("중앙"), BorderLayout.CENTER);

        j.setVisible(true);
    }
}

