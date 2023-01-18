package W2D3Practice;

public class Main {
    public static void main(String[] args) {
// Shape tests:
        System.out.println("=== Shape with no args constructor ===");
        Shape shape = new Shape();
        testShqpes(shape);
        System.out.println("=== Shape with red color and not filled ===");
        Shape shape1 = new Shape("RED",false);
        testShqpes(shape1);
// Circle tests:
        System.out.println("=== Circle with no args constructor ===");
        Circle circle = new Circle();
        testShqpes(circle);
        System.out.println("=== Circle with radius 10 ===");
        Circle circle1 = new Circle(10);
        testShqpes(circle1);
        System.out.println("=== Circle with radius 10, color red and not filled ===");
        Circle circle2 = new Circle(10,"RED",false);
        testShqpes(circle2);
// Rectangle tests:
        System.out.println("=== Rectangle with no args constructor ===");
        Rectangle rectangle = new Rectangle();
        testShqpes(rectangle);
        System.out.println("=== Rectangle with width 10 and length 8 ===");
        Rectangle rectangle1 = new Rectangle(10,8);
        testShqpes(rectangle1);
        System.out.println("=== Rectangle with width 10 and length 8, color red and not filled ===");
        Rectangle rectangle2 = new Rectangle(10,8,"RED",false);
        testShqpes(rectangle2);
// Square tests:
        System.out.println("=== Square with no args constructor ===");
        Square square = new Square();
        testShqpes(square);
        System.out.println("=== Square with side 5 ===");
        Square square1 = new Square(5);
        testShqpes(square1);
        System.out.println("=== Square with side 5, color red and not filled ===");
        Square square2 = new Square(5,"RED",false);
        testShqpes(square2);
    }

    public static void testShqpes(Shape shape){
        System.out.println("Color: "+ shape.getColor());
        System.out.println("Filled: "+ shape.isFilled());
        if(shape instanceof Rectangle){
            if((Rectangle)shape instanceof Square){
                System.out.printf("Side: %.2f\n",((Square)shape).getSide());
                System.out.printf("Area: %.2f\n", ((Square)shape).getArea());
                System.out.printf("Perimeter: %.2f\n", ((Square)shape).getPerimeter());
            }else {
                System.out.printf("Width: %.2f\n", ((Rectangle) shape).getWidth());
                System.out.printf("Length: %.2f\n", ((Rectangle) shape).getLength());
                System.out.printf("Area: %.2f\n", ((Rectangle) shape).getArea());
                System.out.printf("Perimeter: %.2f\n", ((Rectangle) shape).getPerimeter());
            }
        } else if (shape instanceof Circle) {
            System.out.printf("Radius: %.2f\n",((Circle)shape).getRadius());
            System.out.printf("Area: %.2f\n",((Circle)shape).getArea());
            System.out.printf("Perimeter: %.2f\n",((Circle)shape).getPerimeter());
        }
        System.out.println(shape);
        System.out.println("=====================================");
        System.out.println();
        System.out.println();
    }

}
