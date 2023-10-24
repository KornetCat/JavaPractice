package lab2.S;

public class TestBall {
    public static void main(String[] args) {
        Ball r = new Ball();
        System.out.println(r);
        r.setY(1.0);
        System.out.println("y="+r.getY());
        r.setX(1.0);
        System.out.println("x="+r.getX());
        r.move(2.0, 2.0);
        System.out.println(r);
        r.setXY(1.5, 3.5);
        System.out.println(r);
    }
}
