public class Square extends Rectangle{
    protected double side;

    Square()
    {
    side=4;
    }
    Square(double side)
    {
        this.side=side;
    }
    Square(double side, String color, boolean filled)
    {
        this.side=side;
        this.color=color;
        this.filled=filled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double side) {
       this.width=side;
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    double getPerimeter() {
        return (4*this.side);
    }
}
