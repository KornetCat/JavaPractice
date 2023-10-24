package lab4_1;

public class Square extends Rectangle{
    public Square(String color, boolean fill, double side) {
        super(color, fill, side, side);
    }
    public double GetSide(){
        return length;
    }
    public void SetSide(double side){
        length=side;
        width=side;
    }

    @Override
    public void setWidth(double width) {
        length=width;
        this.width=width;
    }

    @Override
    public void setLength(double length) {
        this.length=length;
        width=length;
    }

    @Override
    public String toString() {
        return "Square(side="+length+",filled="+filled+", color="+color+")";
    }
}
