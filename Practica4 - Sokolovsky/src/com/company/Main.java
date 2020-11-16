package src.com.company;
import javax.swing.*;
import java.awt.*;
class Practica4 extends JFrame
{
        JTextField jtest = new JTextField(10); //Размер строки для ввода текста
        Font fonttest = new Font("Times New Roman",Font.BOLD,20); //пользовательское имя шрифта, вид шрифта и размер символов
        Practica4()
        {
            super("Window"); //название окна
           setLayout(new FlowLayout(2)); //расположение элементов в окне относительно друг друга
            setSize(500,500); //размер окна
            add(jtest);
            jtest.setForeground(Color.RED); //цвет текста в поле для ввода
            jtest.setFont(fonttest);
            setVisible(true);
        }

    public static void main(String[] args) {
        new Practica4();
    }

}