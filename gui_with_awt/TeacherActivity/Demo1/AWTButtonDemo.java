import java.awt.*;
import java.awt.event.*;

public class AWTButtonDemo {
    public static void main(String[] args) {
        Frame f = new Frame("AWT Demo");
        Button b = new Button("Click Me");
        b.setBounds(50, 100, 80, 30);
        
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked!");
            }
        });
        
        f.add(b);
        f.setSize(300, 200);
        f.setLayout(null);
        f.setVisible(true);
    }
}
