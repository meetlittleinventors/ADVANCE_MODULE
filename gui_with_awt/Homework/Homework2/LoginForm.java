import javax.swing.*;
import java.awt.event.*;

public class LoginForm {
    public static void main(String[] args) {
        JFrame f = new JFrame("Login Form");

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(20, 20, 80, 30);
        JTextField username = new JTextField();
        username.setBounds(120, 20, 150, 30);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(20, 60, 80, 30);
        JTextField password = new JTextField();
        password.setBounds(120, 60, 150, 30);

        JButton login = new JButton("Login");
        login.setBounds(20, 100, 80, 30);

        JButton clear = new JButton("Clear");
        clear.setBounds(120, 100, 80, 30);

        login.addActionListener(e -> 
            JOptionPane.showMessageDialog(f, 
                "Username: " + username.getText() + "\nPassword: " + password.getText())
        );

        clear.addActionListener(e -> {
            username.setText("");
            password.setText("");
        });

        f.add(userLabel); f.add(username);
        f.add(passLabel); f.add(password);
        f.add(login); f.add(clear);

        f.setSize(350, 200);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
