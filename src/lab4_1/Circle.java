package lab4_1;

public class Circle extends Shape {
    protected double radius;

    public Circle(String color, boolean fill, double rad) {
        super(color, fill);
        this.radius = rad;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double GetArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return "Circle(radius="+radius+",filled="+filled+", color="+color+")";
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
}
