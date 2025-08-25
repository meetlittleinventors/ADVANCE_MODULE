import javax.swing.*;
import java.awt.event.*;

public class StudentEasy1 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Home GUI");
        JButton b = new JButton("Click Me");
        b.setBounds(50, 50, 100, 30);
        
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f, "Hello, Welcome!");
            }
        });
        
        f.add(b);
        f.setSize(300, 200);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
