import javax.swing.*;
import java.awt.event.*;

public class Calculator {
    public static void main(String[] args) {
        JFrame f = new JFrame("Simple Calculator");

        JTextField t1 = new JTextField();
        t1.setBounds(50, 50, 100, 30);
        JTextField t2 = new JTextField();
        t2.setBounds(50, 100, 100, 30);

        JButton b = new JButton("Add");
        b.setBounds(50, 150, 80, 30);

        JLabel l = new JLabel("Result:");
        l.setBounds(50, 200, 150, 30);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int sum = a + b;
                l.setText("Result: " + sum);
            }
        });

        f.add(t1); f.add(t2); f.add(b); f.add(l);

        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
