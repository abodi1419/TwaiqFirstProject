package Anything.W2D4;

public class TeacherFullTime extends Teacher {

    private double yearly = 12;
    private double bonus = 0.2;

    public TeacherFullTime(String firstName, String lastName, String email, String phoneNumber, double salary, double yearly, double bonus) {
        super(firstName, lastName, email, phoneNumber, salary);
        this.yearly = yearly;
        this.bonus = bonus;
    }

//    public void setSalary(double salary) {
//        yearly = salary * 12;
//        bonus = salary *  0.2; // 20%
//        double totalSalary = 0;
//        totalSalary += bonus + yearly;
////        super.setSalary(finaltotalSalary);
//        System.out.println(totalSalary);
//    }

    @Override
    double getSalary() {
        return 0;
    }
}
