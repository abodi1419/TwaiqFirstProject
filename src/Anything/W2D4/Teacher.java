package Anything.W2D4;

abstract class Teacher extends Person {
    private double salary;

    public Teacher(String firstName, String lastName, String email, String phoneNumber, double salary) {
        super(firstName, lastName, email, phoneNumber);
        this.salary = salary;
    }


    abstract double getSalary();

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
