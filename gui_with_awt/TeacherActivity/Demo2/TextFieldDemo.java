import java.awt.*;
import java.awt.event.*;

public class TextFieldDemo {
    public static void main(String[] args) {
        Frame f = new Frame("AWT TextField Demo");
        Label l = new Label("Enter Name:");
        l.setBounds(20, 50, 80, 30);
        
        TextField tf = new TextField();
        tf.setBounds(120, 50, 150, 30);
        
        Button b = new Button("Submit");
        b.setBounds(50, 100, 80, 30);
        
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello, " + tf.getText());
            }
        });
        
        f.add(l); f.add(tf); f.add(b);
        f.setSize(350, 200);
        f.setLayout(null);
        f.setVisible(true);
    }
}
