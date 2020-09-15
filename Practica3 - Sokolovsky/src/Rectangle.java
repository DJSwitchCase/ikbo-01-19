public class Rectangle extends Shape{
    protected double width;
    protected double length;

    Rectangle()
    {
        this.width=1;
        this.length=1;
    }

    Rectangle(double width, double length, boolean filled, String color)
    {
    super(color, filled);
    this.width=width;
    this.length=length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    double getArea() {
        return (width*length);
    }

    @Override
    double getPerimeter() {
        return (2*width+2*length);
    }
}
