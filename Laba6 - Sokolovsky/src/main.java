import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class main extends JFrame {
    main() {
        super("Окно с надписью");
        setSize(600,600);

        JPanel panel = new JPanel();
        setContentPane(panel);
        panel.setLayout(new GridLayout(2,1 ,3,10));

        JButton btn = new JButton("alo");

        panel.add(btn);
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add((new LineBorder(Color.ORANGE, 1), "LineBorder"));
        System.out.println(getContentPane().getComponentCount());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        JFrame myWindow = new main();
        myWindow.setVisible(true);
    }
}