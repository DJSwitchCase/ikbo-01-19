import javax.swing.*;

public class Shape extends JPanel {
 protected    int x, y;
 protected   String colorLine, colorOval, colorRectangle;

    public int getX1() {
        return x;
    }

    public void setX1(int x) {
        this.x = x;
    }

    public int getY1() {
        return y;
    }

    public void setY1(int y) {
        this.y = y;
    }
}
