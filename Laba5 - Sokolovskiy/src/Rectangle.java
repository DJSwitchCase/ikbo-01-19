import java.awt.*;

public class Rectangle extends Oval {
Rectangle(int x, int y, String colorLine, String colorRect, String colorOval)
{
    super(x+50, y+50, colorLine, colorRect, colorOval);

    System.out.println("Конструктор прямоугольника");
}
    protected void paintComponent(Graphics g)
{
    //System.out.println("3");
    super.paintComponent(g);
    //System.out.println("4");
   MyColor mobj = new MyColor();
    g.setColor(mobj.getColor(colorRectangle));
    g.drawRect(x+80,y+80,100,50);
    System.out.println("colorRect = "+colorRectangle+ " нарисовал прямоугольник");
}

}
