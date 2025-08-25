import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextAreaDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("JTextArea Demo");

        JLabel l = new JLabel("Enter Comments:");
        l.setBounds(20, 20, 150, 30);

        JTextArea ta = new JTextArea();
        ta.setBounds(20, 60, 300, 100);

        JScrollPane sp = new JScrollPane(ta);
        sp.setBounds(20, 60, 300, 100);
        sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        JButton b = new JButton("Show");
        b.setBounds(20, 170, 80, 30);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f, ta.getText());
            }
        });

        f.add(l);
        f.add(sp);
        f.add(b);
        f.setSize(400, 250);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
