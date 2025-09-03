import javax.swing.*;
import java.awt.event.*;

public class TempConverter {
    public static void main(String[] args) {
        JFrame f = new JFrame("Temperature Converter");

        JLabel l1 = new JLabel("Celsius:");
        l1.setBounds(30, 30, 100, 30);
        JTextField t1 = new JTextField();
        t1.setBounds(100, 30, 100, 30);

        JButton b = new JButton("Convert");
        b.setBounds(100, 70, 100, 30);

        JLabel result = new JLabel("Fahrenheit: ");
        result.setBounds(30, 120, 200, 30);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double c = Double.parseDouble(t1.getText());
                double fTemp = (c * 9/5) + 32;
                result.setText("Fahrenheit: " + fTemp);
            }
        });

        f.add(l1); f.add(t1); f.add(b); f.add(result);

        f.setSize(300, 200);
        f.setLayout(null);
        f.setVisible(true);
    }
}
