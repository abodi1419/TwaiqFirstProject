package Anything.W2D5;

public class Rectangle extends Shape {

    private double width;
    private double length;

    public Rectangle(){

    }

    @Override
    public void draw() {
        for (int i=0;i<width;i++){
            System.out.print("* ");
        }
        System.out.println();
        for (int i=0;i<length-1;i++){
            System.out.print("* ");
            for (int j=0;j<width-2;j++){
                System.out.print("  ");
            }
            System.out.println("*");

        }
        for (int i=0;i<width;i++){
            System.out.print("* ");
        }
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return width*length;
    }

    public double getPerimeter(){
        return 2*(length+width);

    }

    @Override
    public String toString() {
        return "A Rectangle with width="+width+" and length="+length+", which is a subclass of "+super.toString();
    }
}
