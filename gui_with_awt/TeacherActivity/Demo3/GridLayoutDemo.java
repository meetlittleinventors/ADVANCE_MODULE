import java.awt.*;

public class GridLayoutDemo {
    public static void main(String[] args) {
        Frame f = new Frame("GridLayout Demo");
        f.setLayout(new GridLayout(2, 2));
        
        f.add(new Button("Button 1"));
        f.add(new Button("Button 2"));
        f.add(new Button("Button 3"));
        f.add(new Button("Button 4"));
        
        f.setSize(300, 200);
        f.setVisible(true);
    }
}
