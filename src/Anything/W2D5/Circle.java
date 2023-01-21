package Anything.W2D5;

public class Circle extends Shape {

    private double radius=1.0;

    public Circle(){

    }

    @Override
    public void draw() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*((radius/2)*(radius/2));
    }

    public double getPerimeter(){
        return 2*Math.PI*(radius/2);
    }

    @Override
    public String toString() {
        return "A Circle with radius="+radius+", which is a subclass of "+super.toString();
    }
}
