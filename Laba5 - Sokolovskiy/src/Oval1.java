import java.awt.*;

public class Oval1 extends Shape {
    Oval1(int x, int y, String colorLine, String colorRect, String colorOval)
    {
        this.x = x;
        this.y = y;
        this.colorLine = colorLine;
        this.colorOval = colorOval;
        this.colorRectangle = colorRect;
        System.out.println("Конструктор овала!");
    }
    protected void paintComponent(Graphics g)
    {
        int count =0;
        count++;
        MyColor mobj = new MyColor();
        g.setColor(mobj.getColor(colorLine));
        g.drawLine(10,20,100,50);
        System.out.println("colorLine = "+colorLine+" нарисовал линию");;
        g.setColor(mobj.getColor(colorRectangle));
        g.drawRect(x+70,y+70,100,50);
        System.out.println("colorRect = "+colorRectangle+ " нарисовал прямоугольник");
        g.setColor(mobj.getColor(colorOval));
        g.drawOval(x,y,100,50);
        System.out.println("colorOval = "+colorOval+" нарисовал овал");


    }
}
