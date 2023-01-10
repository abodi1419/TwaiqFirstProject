import java.io.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    // First project ever
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

//        tenthTask(sc);
        System.out.println("================ First task ================");
        firstTask(sc);
        System.out.println("================ Second task ================");
        secondTask(sc);
        System.out.println("================ Third task ================");
        thirdTask(sc);
        System.out.println("================ Fourth task ================");
        fourthTask(sc);
        System.out.println("================ Fifth task ================");
        fifthTask(sc);
        System.out.println("================ Sixth task ================");
        sixthTask(sc);
        System.out.println("================ Seventh task ================");
        seventhTask(sc);
        System.out.println("================ Eighth task ================");
        eightTask(sc);
        System.out.println("================ Ninth task ================");
        ninthTask(sc);


    }






    public static void firstTask(Scanner sc){
        while (true) {
            try {
                System.out.print("Enter first number: ");
                int num1 = Integer.parseInt(sc.next());
                System.out.print("Enter second number: ");
                int num2 = Integer.parseInt(sc.next());
                System.out.println(num1+" + "+num2+" = "+(num1+num2));
                System.out.println(num1+" - "+num2+" = "+(num1-num2));
                System.out.println(num1+" x "+num2+" = "+(num1*num2));
                if (num2==0){
                    System.out.println(num1+" / "+num2+" = "+"Not defined!");
                }else {
                    System.out.println(num1+" / "+num2+" = "+(num1/num2));

                }
                if (num2==0){
                    System.out.println(num1+" mod "+num2+" = "+"Not defined!");
                }else {
                    System.out.println(num1+" mod "+num2+" = "+(num1%num2));

                }

                break;
            } catch (NumberFormatException e) {
                System.err.println("Enter an integer number!");
                continue;
            }

        }

    }

    public static void secondTask(Scanner sc){
        System.out.print("Input a String: ");
        sc.nextLine();
        String input = sc.nextLine();
        System.out.println("Output: ");
        System.out.println("\t"+input.toLowerCase());
    }

    public static void thirdTask(Scanner sc){
        while (true){
            System.out.print("Input an integer: ");
            try {
                int num = Integer.parseInt(sc.next());
                int sum = 0;
                for (char c: (num+"").toCharArray()){
                    sum+=Integer.parseInt(c+"");
                }
                System.out.println("The sum of the digits is: "+sum);
                break;
            } catch (NumberFormatException e) {
                System.err.println("Enter an integer number!");
                continue;
            }
        }

    }

    public static void fourthTask(Scanner sc){
        System.out.print("Input a string: ");
        sc.nextLine();
        String input = sc.nextLine();
        String output="";
        for (int i = input.length()-1; i>=0;i--){
            output+=input.charAt(i);
        }
        System.out.println("Reverse string: "+output);
    }

    public static void fifthTask(Scanner sc){
        while (true){
            try {
                System.out.print("Input a number: ");
                int num = Integer.parseInt(sc.next());
                if(num%2==0){
                    System.out.println("Output: \n\t1");
                }else {
                    System.out.println("Output: \n\t0");
                }
                break;
            } catch (NumberFormatException e) {
                System.err.println("Enter an integer number!");
                continue;
            }
        }
    }


    public static void sixthTask(Scanner sc){
        System.out.print("Enter your role (Admin,Superuser,User): ");
        String role = sc.next();
        if(role.equalsIgnoreCase("Admin")){
            System.out.println("Welcome Admin");
        }else if(role.equalsIgnoreCase("Superuser")){
            System.out.println("Welcome Superuser");
        }else {
            System.out.println("Welcome User");
        }
    }

    public static void seventhTask(Scanner sc){
        while (true) {
            try {
                System.out.print("Input first number: ");
                int num1 = Integer.parseInt(sc.next());
                System.out.print("Input second number: ");
                int num2 = Integer.parseInt(sc.next());
                System.out.print("Input third number: ");
                int num3 = Integer.parseInt(sc.next());

                System.out.println("The result is: "+(num1+num2==num3));


                break;
            } catch (NumberFormatException e) {
                System.err.println("Enter an integer number!");
                continue;
            }

        }
    }

    public static void eightTask(Scanner sc){
        while (true) {
            try {
                System.out.print("Input 1st number: ");
                int num1 = Integer.parseInt(sc.next());
                System.out.print("Input 2nd number: ");
                int num2 = Integer.parseInt(sc.next());
                System.out.print("Input 3rd number: ");
                int num3 = Integer.parseInt(sc.next());

                int largest = (num1>num2)?num1:num2;
                largest = (largest>num3)?largest:num3;
                System.out.println("The greatest: "+largest);



                break;
            } catch (NumberFormatException e) {
                System.err.println("Enter an integer number!");
                continue;
            }

        }
    }

    public static void ninthTask(Scanner sc){

        while (true) {
            try {
                System.out.print("Input number: ");
                int num = Integer.parseInt(sc.next());
                if(num>7||num<1){
                    System.err.println("Enter a number between 1 and 7!");
                    continue;
                }

                switch (num){
                    case 1:
                        System.out.println("Monday");
                        break;
                    case 2:
                        System.out.println("Tuesday");
                        break;
                    case 3:
                        System.out.println("Wednesday");
                        break;
                    case 4:
                        System.out.println("Thursday");
                        break;
                    case 5:
                        System.out.println("Friday");
                        break;
                    case 6:
                        System.out.println("Saturday");
                        break;
                    case 7:
                        System.out.println("Sunday");
                }

                break;
            } catch (NumberFormatException e) {
                System.err.println("Enter an integer number!");
                continue;
            }

        }
       // String [] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

    }



}