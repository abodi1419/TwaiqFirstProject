package Week2.W2D3Practice;

public class Square extends Rectangle{
    public Square() {
    }

    public Square(double side){
        super(side,side);
    }
    public Square(double side, String color, boolean filled){
        super(side,side,color,filled);
    }

    public double getSide(){
        return super.getLength();
    }

    public void setSide(double width){
        super.setLength(width);
        super.setWidth(width);
    }

    @Override
    public String toString() {
        return "A Square with side="+getSide()+", which is a subclass of "+super.toString();
    }
}
