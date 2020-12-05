import java.awt.*;

public class Line extends Rectangle {
    private int count = 0;
    Line(int x, int y, String colorLine, String colorRect, String colorOval)
    {
        super(x+10, y+10, colorLine, colorRect, colorOval);
        System.out.println("Конструктор линию");
    }
    protected void paintComponent(Graphics g)
    {

        //System.out.println("1");
        super.paintComponent(g);
        //System.out.println("2");
        MyColor mobj = new MyColor();
        g.setColor(mobj.getColor(colorLine));
        g.drawLine(10,20,100,50);
        System.out.println("colorLine = "+colorLine+" нарисовал линию");
    }
}
