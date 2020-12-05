import java.awt.*;

public class Oval extends Shape {
    Oval(int x, int y, String colorLine, String colorRect, String colorOval)
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
        MyColor mobj = new MyColor();
        g.setColor(mobj.getColor(colorOval));
        g.drawOval(x,y,100,50);
        System.out.println("colorOval = "+colorOval+" нарисовал овал");


    }
}
