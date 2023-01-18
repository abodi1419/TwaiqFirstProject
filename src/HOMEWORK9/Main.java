package HOMEWORK9;

public class Main {

    public static void main(String[] args) {
        Book book = new Book("Java spring boot", 1500, "Ahmed");
        Movie movie = new Movie("Spring boot", 1250, "Abdullah");

        System.out.println("================ Movie ================");
        System.out.println("Name: "+movie.getDiscount());
        System.out.println("Director: "+movie.getDirector());
        System.out.println("Discount: "+movie.getDiscount());
        System.out.println("================ Book ================");
        System.out.println("Name: "+book.getName());
        System.out.println("Author: "+book.getAuthor());
        System.out.println("Discount: "+book.getDiscount());

        System.out.println("================ Movable point ================");
        System.out.println("x: 10, y=10, xSpeed=2, ySpeed=2");
        Movable movable = new MovablePoint(10,10,2,2);
        System.out.println("Moving up...");
        movable.moveUp();
        System.out.println("Moving down...");
        movable.moveDown();
        System.out.println("Moving down...");
        movable.moveDown();
        System.out.println("Moving right...");
        movable.moveRight();
        System.out.println("Moving right...");
        movable.moveRight();
        System.out.println("Moving left...");
        movable.moveLeft();


    }



}
