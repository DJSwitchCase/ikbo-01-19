public class Ball {
    private int x;
    private int y;

    public Ball(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y)
    {
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void move(int xDisp, int yDisp)
    {
        x+=xDisp;
        y+=yDisp;
    }

    @Override
    public String toString() {
        return "Ball @ " +
                "(" + x +
                ", " + y +
                ')';
    }
}
