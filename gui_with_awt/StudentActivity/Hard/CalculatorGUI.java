import javax.swing.*;
import java.awt.event.*;

public class CalculatorGUI {
    public static void main(String[] args) {
        JFrame f = new JFrame("Simple Calculator");
        
        JTextField num1 = new JTextField();
        num1.setBounds(50, 50, 100, 30);
        JTextField num2 = new JTextField();
        num2.setBounds(160, 50, 100, 30);
        
        JLabel result = new JLabel("Result:");
        result.setBounds(50, 150, 200, 30);
        
        JButton add = new JButton("Add");
        add.setBounds(50, 100, 80, 30);
        JButton sub = new JButton("Subtract");
        sub.setBounds(140, 100, 100, 30);
        JButton clear = new JButton("Clear");
        clear.setBounds(250, 100, 80, 30);
        
        add.addActionListener(e -> result.setText("Result: " +
            (Integer.parseInt(num1.getText()) + Integer.parseInt(num2.getText()))
        ));
        
        sub.addActionListener(e -> result.setText("Result: " +
            (Integer.parseInt(num1.getText()) - Integer.parseInt(num2.getText()))
        ));
        
        clear.addActionListener(e -> {
            num1.setText(""); num2.setText(""); result.setText("Result:");
        });
        
        f.add(num1); f.add(num2); f.add(add); f.add(sub); f.add(clear); f.add(result);
        f.setSize(400, 250);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
