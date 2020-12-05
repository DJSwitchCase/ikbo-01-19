import javax.swing.*;
import java.awt.*;
public class main extends JFrame {
    public static void main(String[] args) {
      JFrame frame = new JFrame("SUKA!!!!!");
      frame.setBackground(Color.white);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Line l = new Line(100, 50, "red", "green", "blue");
        frame.add(l);
        frame.setSize(800,600);
       frame.setVisible(true);

    }
}
