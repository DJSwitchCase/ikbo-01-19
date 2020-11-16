import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example2 extends JFrame
{
JTextField TextField1 = new JTextField(20);
JTextField TextField2 = new JTextField(20);
JButton button1 = new JButton("Let's roll bois");
Font font1 = new Font("Aloha",Font.BOLD,20);

    Example2()
    {
    super("THE WINDOW");
    setLayout(new FlowLayout());
    setSize(300, 400);
    add (new JLabel("1st Number"));
    add(TextField1);
    add (new JLabel("2nd Number"));
    add(TextField2);
    add(button1);
    button1.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
         try
         {
             double x1 = Double.parseDouble(TextField1.getText().trim());
             double x2 = Double.parseDouble(TextField2.getText().trim());

             JOptionPane.showMessageDialog(null, "Result = "+(x1+x2),"window",JOptionPane.INFORMATION_MESSAGE);
         }
         catch (Exception ae)
         {
             JOptionPane.showMessageDialog(null, "Error in numbers!","alert",JOptionPane.ERROR_MESSAGE);
         }
        }
    });
    setVisible(true);
    }

    public static void main(String[] args)
    {
    new Example2();
    }
}
