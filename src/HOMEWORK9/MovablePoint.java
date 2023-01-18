package HOMEWORK9;

public class MovablePoint implements Movable{
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        y+=ySpeed;
        System.out.println("Y increased by "+ySpeed+" to "+y);
    }

    @Override
    public void moveDown() {
        y-=ySpeed;
        System.out.println("Y decreased by "+ySpeed+" to "+y);

    }

    @Override
    public void moveLeft() {
        x-=xSpeed;
        System.out.println("X decreased by "+xSpeed+" to "+x);

    }

    @Override
    public void moveRight() {
        x+=xSpeed;
        System.out.println("X increased by "+xSpeed+" to "+x);

    }
}
