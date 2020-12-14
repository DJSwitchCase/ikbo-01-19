import javax.swing.*;
import java.awt.*;

public class Zadanie1 extends JFrame
{
    Zadanie1()
    {
        super("Window");
        setSize(800,600);
        setVisible(true);

        JPanel p = new JPanel();
        add(p);

        JTextField f = new JTextField();
        add(f);
    }

    public static void main(String[] args)
    {
        Zadanie1 z = new Zadanie1();
    }
}
