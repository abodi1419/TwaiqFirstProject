package Week2;

import java.util.Arrays;
import java.util.Scanner;

public class W2D1 {
    static String selected="";
    static char [][] ticTac;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n7Task(sc);
        ticTac(sc);

    }

    public static void ticTac(Scanner sc){
        initTicTac();
        System.out.println("Welcome to Tic Tac Toe");
        printTicTac();

        System.out.println();
        while (true) {
            System.out.print("Enter your choice: ");
            try {
                int choice = Integer.parseInt(sc.next());
                if (choice>9 || choice<1) {
                    System.out.println("Invalid number!");
                    continue;
                }
                if(selectPlace(choice,'X')==-1){
                    continue;
                };

                printTicTac();
                if(checkWinner()){
                    System.out.println("Press enter to continue..");
                    sc.nextLine();
                    sc.nextLine();
                    continue;
                }
                computerTurn();
                printTicTac();
                if(checkWinner()){
                    System.out.println("Press enter to continue..");
                    sc.nextLine();
                    sc.nextLine();
                }

            }catch (NumberFormatException e){
                System.out.println("Invalid input enter integer!");
            }

        }
    }

    public static int selectPlace(int choice, char fill){
        int j = (choice%3);
        if(choice%3==0&&choice<4){
            j=choice-1;
        }else if(choice%3==0&&choice>4){
            j=2;
        }
        else {
            j=(choice%3)-1;
        }
        int i = 0;
        if(choice>3&& choice<7){
            i=1;
        }else if(choice>6 && choice<10){
            i=2;
        }
        if(selected.contains(choice+"")){
            if(fill=='X') {
                System.out.println("Already taken place!");
            }
            return -1;
        }else {
            selected+=choice;
        }
        ticTac[i][j] = fill;
        if(fill=='O'){
            System.out.println("Coputer choice: "+choice);
        }
        return 1;
    }

    public static void initTicTac(){
        ticTac = new char[3][3];
        for (int i=0; i<ticTac.length;i++){
            for (int j=0;j<ticTac[i].length; j++){
                ticTac[i][j]=' ';
            }
        }
    }

    public static void printTicTac(){
        for (int i=0; i<ticTac.length;i++){
            System.out.print("\t\t");
            for (int j=0; j<ticTac[i].length; j++){
                System.out.print(ticTac[i][j]);
                if(ticTac[i].length-1 != j){
                    System.out.print(" | ");
                }
            }
            if(i!=ticTac.length-1) {
                System.out.println("\n\t\t---------");
            }
        }
        System.out.println();
    }

    public static void computerTurn(){
        while (true) {
            int place = (int) (Math.random() * 9)+1;
            int result = selectPlace(place,'O');
            if(result==1){
                break;
            }
        }
    }

    public static boolean checkWinner(){
        // patterns
        // 123
        // 456
        // 789
        // 159
        // 753
        // 147
        // 258
        // 369

        boolean flag=true;
        if(ticTac[0][0] == ticTac[0][1] && ticTac[0][0] == ticTac[0][2] && !(ticTac[0][0]+""+ticTac[0][1]+ticTac[0][2]+"").contains(" ")){
            weHaveAWinner(ticTac[0][0]);
        } else if (ticTac[1][0] == ticTac[1][1] && ticTac[1][0] == ticTac[1][2] && !(ticTac[1][0]+""+ticTac[1][1]+ticTac[1][2]).contains(" ")) {
            weHaveAWinner(ticTac[1][0]);
        } else if (ticTac[2][0] == ticTac[2][1] && ticTac[2][0] == ticTac[2][2] && !(ticTac[2][0]+""+ticTac[1][1]+ticTac[2][2]+"").contains(" ")) {
            weHaveAWinner(ticTac[2][0]);
        } else if (ticTac[0][0] == ticTac[1][1] && ticTac[0][0] == ticTac[2][2] && !(ticTac[0][0]+""+ticTac[1][1]+ticTac[2][2]+"").contains(" ")) {
            weHaveAWinner(ticTac[0][0]);
        }else if (ticTac[0][2] == ticTac[1][1] && ticTac[0][2] == ticTac[2][0] && !(ticTac[0][2]+""+ticTac[1][1]+ticTac[2][0]+"").contains(" ")) {
            weHaveAWinner(ticTac[0][2]);
        }else if (ticTac[0][0] == ticTac[1][0] && ticTac[0][0] == ticTac[2][0] && !(ticTac[0][0]+""+ticTac[1][0]+ticTac[2][0]+"").contains(" ")) {
            weHaveAWinner(ticTac[0][0]);
        }else if (ticTac[0][1] == ticTac[1][1] && ticTac[0][1] == ticTac[2][1] && !(ticTac[0][1]+""+ticTac[1][1]+ticTac[2][1]+"").contains(" ")) {
            weHaveAWinner(ticTac[0][1]);
        }else if (ticTac[0][2] == ticTac[1][2] && ticTac[0][2] == ticTac[2][2] && !(ticTac[0][2]+""+ticTac[1][2]+ticTac[2][2]+"").contains(" ")) {
            weHaveAWinner(ticTac[0][2]);
        }else {
            flag = false;
            boolean isFinished=true;
            for (int i = 0; i<ticTac.length; i++){
                for (int j=0; j<ticTac[i].length; j++){
                    if(ticTac[i][j] == ' '){
                        isFinished = false;
                    }
                }
            }
            if (isFinished){
                System.out.println("We have a draw!");
                initTicTac();
                selected="";
                return true;
            }
        }
        return flag;
    }
    public static void weHaveAWinner(char winner){
        System.out.println(winner+" has WON!");
        selected="";
        initTicTac();
    }

    public static void printArr(int [] arr){
        System.out.print("arr: [\n");
        for (int i=0;i<arr.length;i++){
            System.out.print("\t"+i+" => ");
            System.out.print(arr[i]);
            if(i!=arr.length-1){
                System.out.print(", \n");
            }
        }
        System.out.println("\n]");
    }
    public static void n7Task(Scanner sc){
        String menu =
                "a. Create array with elements\n"+
                        "b. Display elements of an array\n"+
                        "c. Search the element within array\n"+
                        "d. Sort the array\n"+
                        "e. Exit\n"+
                        "Enter option: ";
        int [] arr=null;

        while(true){
            System.out.print(menu);
            char choice = sc.next().charAt(0);
            choice = Character.toLowerCase(choice);
            if(choice=='a'){
                while (true){
                    System.out.print("Enter size of the array: ");
                    try {
                        int size = Integer.parseInt(sc.next());
                        arr = new int[size];
                        break;
                    }catch (NumberFormatException e){
                        System.err.println("Please enter an integer number!");
                    }
                }
                for (int i=0; i<arr.length; i++){
                    System.out.print("Enter value at ["+i+"]: ");
                    try {
                        int value = Integer.parseInt(sc.next());
                        arr[i] = value;
                    }catch (NumberFormatException e){
                        i--;
                        System.err.println("Please enter an integer number!");
                    }

                }

            }else if(choice=='b'){
                if(arr==null){
                    System.err.println("Please add values by choosing a.");
                    continue;
                }
                printArr(arr);

            }else if (choice=='c'){
                if(arr==null){
                    System.err.println("Please add values by choosing a.");
                    continue;
                }
                while (true){
                    try {
                        System.out.print("Enter search key: ");
                        int key = Integer.parseInt(sc.next());
                        boolean flag = false;
                        for (int i=0;i<arr.length;i++){
                            if (arr[i] == key){
                                System.out.println("Found at index: "+i);
                                flag=true;
                                break;
                            }
                        }
                        if(!flag){
                            System.out.println(key+" Not found in array!");
                        }
                        break;
                    }catch (NumberFormatException e){
                        System.err.println("Please enter an integer number!");
                    }

                }


            } else if (choice=='d') {
                if(arr==null){
                    System.err.println("Please add values by choosing a.");
                    continue;
                }
                Arrays.sort(arr);
                System.out.println("Array sorted.");
                printArr(arr);

            }else if (choice=='e'){
                break;
            }
            else {
                System.err.println("Wrong choice!");
            }
        }

    }
}
