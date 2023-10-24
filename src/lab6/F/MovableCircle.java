package lab6.F;

public class MovableCircle implements Movable{
    protected int radius;
    protected MovablePoint center;

    public MovableCircle(int radius, int x, int y, int xSpeed, int ySpeed) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public void MoveUp() {
        center.MoveUp();
    }

    @Override
    public void MoveDown() {
        center.MoveDown();
    }

    @Override
    public void MoveRight() {
        center.MoveRight();
    }
    @Override
    public void MoveLeft() {
        center.MoveLeft();
    }

    @Override
    public String toString() {
        return "MovableCircle(radius="+radius+", x="+center.x+", y="+center.y+", xSpeed="+center.xSpeed+", ySpeed="+center.y+")";
    }
}
