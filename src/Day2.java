import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====================== First task ======================");
        firstTask();
        // Task two was made in Main.java
        System.out.println("====================== Third task ======================");
        thirdTask(sc);
        System.out.println("====================== Fourth task ======================");
        fourthTask(sc);
        System.out.println("====================== Fifth task ======================");
        fifthTask(sc);
        System.out.println("====================== Sixth task ======================");
        sixthTask(sc);
        System.out.println("====================== Seventh task ======================");
        seventhTask(sc);
        System.out.println("====================== Eighth task ======================");
        n8Task(sc);
        System.out.println("====================== Ninth task ======================");
        n9Task();
        System.out.println("====================== Tenth task ======================");
        n10Task(sc);
    }

    public static void firstTask(){
        for (int i=0;i<=100; i++){
            System.out.print(i+" ");
            if(i%3==0){
                System.out.print("Fizz");
            }
            if(i%5==0){
                System.out.print("Buzz");
            }
            System.out.println();
        }
    }

    public static void thirdTask(Scanner sc){
        while (true){
            System.out.print("Input a positive integer: ");
            try {
                int num = Integer.parseInt(sc.next());
                System.out.println("-- Multiplication table of "+num+" --");
                for (int i=1;i<=10;i++){
                    System.out.println("\t"+i+" X "+num+" = "+(i*num));
                }
                break;
            } catch (NumberFormatException e) {
                System.err.println("Enter an integer number!");
                continue;
            }
        }
    }

    public static void fourthTask(Scanner sc){
        while (true){
            System.out.print("Input a positive integer: ");
            try {
                int num = Integer.parseInt(sc.next());
                if(num<1){
                    System.err.println("Number must be greater than 0.");
                    continue;
                }
                System.out.println("Factorial of "+num+" is "+factorial(num));
                break;
            } catch (NumberFormatException e) {
                System.err.println("Enter an integer number!");
                continue;
            }
        }
    }

    public static int factorial(int num){
        if(num==1){
            return 1;
        }
        return factorial(num-1)*num;
    }

    public static void fifthTask(Scanner sc){
        while (true){
            System.out.print("Input a number: ");
            try {
                int num1 = Integer.parseInt(sc.next());
                System.out.print("Input the power: ");
                int num2 = Integer.parseInt(sc.next());
                int output=1;
                for (int i=0;i<num2;i++){
                    output*=num1;
                }
                System.out.println(num1+"^"+num2+" = "+output);
                break;
            } catch (NumberFormatException e) {
                System.err.println("Enter an integer number!");
                continue;
            }
        }
    }

    public static void sixthTask(Scanner sc){
        int odd = 0;
        int even = 0;
        while (true){
            System.out.print("Input a number: ");
            try {

                int num = Integer.parseInt(sc.next());
                if(num!=-1){
                    if(num%2==0){
                        even+=num;
                    }else {
                        odd+=num;
                    }
                    continue;
                }else {
                    System.out.println("Odd sum: "+odd);
                    System.out.println("Even sum: "+even);
                }
                break;
            } catch (NumberFormatException e) {
                System.err.println("Enter an integer number!");
                continue;
            }
        }
    }
    public static void seventhTask(Scanner sc){
        while (true){
            System.out.print("Input a number: ");
            try {

                int num = Integer.parseInt(sc.next());
                for (int i=2;i<(num/2);i++){
                    if(num%i==0){
                        System.out.println(num+" is not a prime number.");
                        return;
                    }
                }
                System.out.println(num+" is a prime number.");
                break;
            } catch (NumberFormatException e) {
                System.err.println("Enter an integer number!");
                continue;
            }
        }
    }

    public static void n8Task(Scanner sc){
        int negative = 0;
        int positive = 0;
        int zeros = 0;
        while (true){
            System.out.print("Input a number: ");
            try {

                System.out.print("Input a number (type exit to finish): ");
                String input = sc.next();
                if(input.equalsIgnoreCase("exit")){
                    System.out.println("Positive count: "+positive);
                    System.out.println("Negative count: "+negative);
                    System.out.println("Zeros count: "+zeros);
                    return;
                }
                int num = Integer.parseInt(input);
                if (num < 0) {
                    negative++;
                    continue;
                }
                if (num > 0) {
                    positive++;
                    continue;
                }
                if (num == 0) {
                    zeros++;
                    continue;
                }

                break;
            } catch (NumberFormatException e) {
                System.err.println("Enter an integer number!");
                continue;
            }
        }
    }

    public static void n9Task(){
        for (int i=1;i<=4;i++){
            System.out.println("Week "+i);
            for (int j=1; j<=7;j++){
                System.out.println("Day "+j);
            }
        }
    }

    public static void n10Task(Scanner sc){
        System.out.print("Enter a string: ");
        String text = sc.next();
        String output="";
        for (int i = text.length()-1; i>=0;i--){
            output+=text.charAt(i);
        }
        if(text.equalsIgnoreCase(output)){
            System.out.println("It is a palindrome.");
        }else {
            System.out.println("It is not a palindrome.");
        }
    }
}
