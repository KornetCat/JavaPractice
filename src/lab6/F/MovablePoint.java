package lab6.F;

public class MovablePoint implements Movable {
    public int x;
    public int y;
    public int xSpeed;
    public int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void MoveUp() {
        y += ySpeed;
    }

    @Override
    public void MoveDown() {
        y -= ySpeed;
    }

    @Override
    public void MoveRight() {
        x += xSpeed;
    }

    @Override
    public void MoveLeft() {
        x -= xSpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint(x="+x+", y="+y+", xSpeed="+xSpeed+", ySpeed="+y+")";
    }
}
