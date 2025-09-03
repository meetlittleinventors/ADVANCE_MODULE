import javax.swing.*;

public class SimpleWindow {
    public static void main(String[] args) {
        JFrame f = new JFrame("My First GUI");
        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
