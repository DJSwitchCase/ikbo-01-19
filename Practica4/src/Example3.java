import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.concurrent.Flow;

public class Example3 extends JFrame {
    JTextArea testArea = new JTextArea(30, 15);
    JButton button = new JButton("Add some text");
    JScrollPane jScroll = new JScrollPane(testArea);

    Example3() {
        super("WindowName");
        setSize(500, 500);
        setLayout(new FlowLayout());
        add(testArea);
        add(button);
        add(jScroll); //не работает
        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txt = JOptionPane.showInputDialog(null, "Insert some text");
                testArea.append(txt);
            }
        });
        setVisible(true);
    }
    public static void main(String[] args)
    {
        new Example3();
    }
}