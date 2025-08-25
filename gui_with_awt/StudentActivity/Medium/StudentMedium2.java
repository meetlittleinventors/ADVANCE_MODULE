import javax.swing.*;
import java.awt.*;

public class StudentMedium2 {
    public static void main(String[] args) {
        JFrame f = new JFrame("GridLayout 2x3");
        f.setLayout(new GridLayout(2, 3));
        for(int i=1; i<=6; i++) {
            f.add(new JButton("Button " + i));
        }
        f.setSize(400, 200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
