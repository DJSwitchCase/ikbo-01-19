import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Zadanie extends JFrame
{
    int mil =0;
    int mad=0;
JButton milan = new JButton("AC Milan");
JButton madrid = new JButton("Real Madrid");
JLabel milLab = new JLabel("Result: "+ mil+ "X "+mad);
JLabel madlab = new JLabel("Last Scorer: N/A");

Zadanie()
{
    super("Window");
    setLayout(new FlowLayout());
    setSize(400, 500);
    add(milan);
    add(madrid);
    add (new JLabel("Result: "+ mil+ "X "+mad));
    add (new JLabel("Last Scorer: N/A"));
    add (new Label("Winner: DRAW"));
    milan.addActionListener(new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            mil+=1;
            milLab.setText("Result: "+mil+"X "+mad);
        }
    });

}
    public static void main(String[] args) {
        new Zadanie().setVisible(true);
    }
}
