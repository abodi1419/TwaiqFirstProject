package HOMEWORK9;

public class Book extends Product{
    private String author;

    public Book() {}

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    double getDiscount() {
        return 0.5;
    }
}
