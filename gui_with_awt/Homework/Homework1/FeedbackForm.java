import javax.swing.*;
import java.awt.event.*;

public class FeedbackForm {
    public static void main(String[] args) {
        JFrame f = new JFrame("Feedback Form");
        JLabel l = new JLabel("Enter Name:");
        l.setBounds(20, 20, 100, 30);

        JTextField tf = new JTextField();
        tf.setBounds(120, 20, 150, 30);

        JButton b = new JButton("Submit");
        b.setBounds(20, 70, 100, 30);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f, "Thank you, " + tf.getText() + "!");
            }
        });

        f.add(l); f.add(tf); f.add(b);
        f.setSize(350, 150);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
