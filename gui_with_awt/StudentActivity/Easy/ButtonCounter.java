import javax.swing.*;
import java.awt.event.*;

public class ButtonCounter {
    static int count = 0;

    public static void main(String[] args) {
        JFrame f = new JFrame("Click Counter");

        JButton b = new JButton("Click Me");
        b.setBounds(100, 50, 100, 40);

        JLabel l = new JLabel("Clicked: 0 times");
        l.setBounds(100, 100, 200, 30);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count++;
                l.setText("Clicked: " + count + " times");
            }
        });

        f.add(b);
        f.add(l);
        f.setSize(300, 200);
        f.setLayout(null);
        f.setVisible(true);
    }
}
