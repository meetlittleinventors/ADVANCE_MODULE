import javax.swing.*;

public class WelcomeGUI {
    public static void main(String[] args) {
        JFrame f = new JFrame("Welcome Window");

        JLabel l = new JLabel("Welcome to GUI Programming!");
        l.setBounds(50, 50, 250, 30);

        f.add(l);
        f.setSize(300, 200);
        f.setLayout(null);
        f.setVisible(true);
    }
}
