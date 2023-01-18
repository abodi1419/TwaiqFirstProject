package Week2;

class Student{
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    public Student(){}

    public Student(String firstName, String lastName, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
public class W2D2 {


    public static void main(String[] args) {
        Student st1 = new Student();
        st1.setFirstName("Abdullah");
        st1.setLastName("Alzhrani");
        st1.setPhoneNumber("0548404996");
        st1.setEmail("a@gmail.com");

        Student st2 = new Student();
        st2.setFirstName("Ali");
        st2.setLastName("Alzhrani");
        st2.setPhoneNumber("0555544555");
        st2.setEmail("ali@gmail.com");

        Student st3 = new Student();
        st1.setFirstName("Ahmed");
        st1.setLastName("Alzhrani");
        st1.setPhoneNumber("05484545645");
        st1.setEmail("ahmed@gmail.com");

        printStudent(st1);
        System.out.println("\n");
        printStudent(st2);
        System.out.println("\n");
        printStudent(st3);
    }

    public static void printStudent(Student st){
        System.out.println("================== Week2.Student info ====================");
        System.out.println("Name: " + st.getFirstName()+" "+st.getLastName());
        System.out.println("Phone number: "+ st.getPhoneNumber());
        System.out.println("Email: "+ st.getEmail());
        System.out.println("======================= End =========================");
    }


}
