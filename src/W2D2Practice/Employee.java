package W2D2Practice;

public class Employee {
    private String id;
    private String name;
    private int salary;

    public Employee(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getAnnualSalary(){
        return salary*12;
    }

    public int raisedSalary(int percent){
        salary += (salary*(percent/100.0));
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String [] args){
        Employee emp = new Employee("1", "Abdullah", 120000);
        System.out.println(emp);

        System.out.println("Annual salary: "+emp.getAnnualSalary());
        System.out.println("Raised: "+emp.raisedSalary(25));
    }
}
