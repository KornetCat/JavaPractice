package lab2.S;

public class Ball {
    public double x = 0.0;
    public double y = 0.0;
    public Ball(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Ball(){
        System.out.println(this.x+" "+this.y);
    }
    public double getX(){
        return this.x;
    }
    public void setX(double x){
        this.x = x;
    }
    public double getY(){
        return this.y;
    }
    public void setY(double y){
        this.y = y;
    }
    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void move(double xDisp, double yDisp){
        this.x += xDisp;
        this.y += yDisp;
    }
    public String toString(){
        return "Ball{x="+this.x+"; y="+this.y+"}";
    }
}
