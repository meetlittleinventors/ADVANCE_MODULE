import javax.swing.*;
import java.awt.event.*;

public class StudentMedium1 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Input Demo");
        JTextField name = new JTextField();
        name.setBounds(120, 50, 150, 30);
        JTextField age = new JTextField();
        age.setBounds(120, 90, 150, 30);
        
        JLabel l = new JLabel("Enter Details");
        l.setBounds(50, 10, 200, 30);
        
        JButton b = new JButton("Submit");
        b.setBounds(50, 130, 100, 30);
        
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l.setText("Name: " + name.getText() + ", Age: " + age.getText());
            }
        });
        
        f.add(name); f.add(age); f.add(b); f.add(l);
        f.setSize(400, 250);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
