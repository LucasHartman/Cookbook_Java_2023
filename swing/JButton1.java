import javax.swing.JButton;
import javax.swing.JFrame;

public class JButton1 {
    public static void main(String[] args) {
        // https://www.javatpoint.com/java-jbutton

        // CREATE BUTTON
        JButton b = new JButton("Click Me");
        b.setBounds(40,100,95,30);
        
        // CRATE WINDOW
        JFrame f = new JFrame("Button Example");
        f.add(b);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}