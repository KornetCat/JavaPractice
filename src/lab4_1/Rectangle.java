package lab4_1;

public class Rectangle extends Shape{
    public double width;
    public double length;

    public Rectangle(String color, boolean fill, double width, double length) {
        super(color, fill);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double GetArea() {
        return length*width;
    }

    @Override
    public double getPerimeter() {
        return 2*length+2*width;
    }

    @Override
    public String toString() {
        return "Rectangle(length="+length+",width="+width+",filled="+filled+", color="+color+")";
    }
}
