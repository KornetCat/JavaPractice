package lab4_1;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape(String color, boolean fill) {
        this.color = color;
        filled = fill;
    }
    public String GetColor(){
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double GetArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape(color="+color+", filled="+filled+")";
    }
}


