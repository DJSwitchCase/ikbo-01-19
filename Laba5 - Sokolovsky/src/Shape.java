import javax.swing.*;
import java.awt.*;
abstract class Shape extends JFrame {
    int x, y;
    String color;

    public int getX1() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY1() {
        return y;
    }

    public void setY1(int y) {
        this.y = y;
    }

    public String getColor1() {
        return color;
    }

    public void setColor1(String color) {
        this.color = color;
    }
}
