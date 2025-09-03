import javax.swing.*;
import java.awt.event.*;

public class MiniCalculator {
    public static void main(String[] args) {
        JFrame f = new JFrame("Mini Calculator");

        JTextField t1 = new JTextField();
        t1.setBounds(30, 30, 100, 30);
        JTextField t2 = new JTextField();
        t2.setBounds(150, 30, 100, 30);

        JLabel result = new JLabel("Result: ");
        result.setBounds(30, 150, 200, 30);

        JButton add = new JButton("+");
        add.setBounds(30, 80, 50, 30);
        JButton sub = new JButton("-");
        sub.setBounds(90, 80, 50, 30);
        JButton mul = new JButton("*");
        mul.setBounds(150, 80, 50, 30);
        JButton div = new JButton("/");
        div.setBounds(210, 80, 50, 30);

        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(t1.getText());
                double b = Double.parseDouble(t2.getText());
                double res = 0;

                if (e.getSource() == add) res = a + b;
                else if (e.getSource() == sub) res = a - b;
                else if (e.getSource() == mul) res = a * b;
                else if (e.getSource() == div) res = a / b;

                result.setText("Result: " + res);
            }
        };

        add.addActionListener(listener);
        sub.addActionListener(listener);
        mul.addActionListener(listener);
        div.addActionListener(listener);

        f.add(t1); f.add(t2);
        f.add(add); f.add(sub); f.add(mul); f.add(div);
        f.add(result);

        f.setSize(300, 250);
        f.setLayout(null);
        f.setVisible(true);
    }
}
