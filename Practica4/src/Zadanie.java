import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Zadanie extends JFrame
{
    int mil=0;
    int mad=0;
JButton milan = new JButton("AC Milan");
JButton madrid = new JButton("Real Madrid");
JLabel milLab = new JLabel("Result: "+ mil+ "X "+mad);
JLabel madlab = new JLabel("Last Scorer: N/A");
JLabel winnerlab = new JLabel("WINNER: draw");

Zadanie()
{
    super("Window");
    setLayout(new FlowLayout());
    setSize(400, 500);
    add(milan);
    add(madrid);
    add (milLab);
    add (madlab);
    add(winnerlab);
    milan.addActionListener(new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            mil+=1;
            milLab.setText("Result: "+ mil+ "X"+mad);
            madlab.setText("Last scorer: Milan");
            if (mil>mad)
                winnerlab.setText("Milan");
            else if (mil==mad)
                winnerlab.setText("Draw");
            else if (mil<mad)
                winnerlab.setText("Madrid");

        }
    });
    madrid.addActionListener(new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            mad+=1;
            milLab.setText("Result: "+ mil+ "X"+mad);
            madlab.setText("Last scorer: Madrid");
            if (mil>mad)
                winnerlab.setText("Winner: Milan");
            else if (mil==mad)
                winnerlab.setText("Winner: Draw");
            else if (mil<mad)
                winnerlab.setText("Winner: Madrid");
        }
    });


}
    public static void main(String[] args) {
        new Zadanie().setVisible(true);
    }
}
