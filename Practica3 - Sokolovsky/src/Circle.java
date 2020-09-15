import static java.lang.Math.pow;

public class Circle extends Shape {
    protected double radius;

    Circle()
    {
        super("Red", true);
        this.radius=3;
    }
    Circle(double radius, String color, boolean Filled)
    {
        this.radius=radius;
        this.color=color;
        this.filled=true;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return (pow(radius, 2)*Math.PI);
    }

    @Override
    double getPerimeter() {
        return (2*Math.PI*radius);
    }
}
