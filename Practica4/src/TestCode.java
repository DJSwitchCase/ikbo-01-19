package src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TestCode extends JFrame {
    TestCode() {
        JFrame frame = new JFrame("Demo");
        frame.setLayout(new BorderLayout());
        frame.setSize(250, 100);
        
        final JLabel label = new JLabel("flag");
        JButton button = new JButton("Change flag");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                label.setText("new value");
            }
        });

        frame.add(label, BorderLayout.NORTH);
        frame.add(button, BorderLayout.CENTER);
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        new TestCode();
    }
}