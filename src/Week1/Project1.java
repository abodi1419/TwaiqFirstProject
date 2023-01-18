package Week1;

import java.util.Scanner;

public class Project1 {

    /*
    9-1/3
    8-1/3
    7-
     */
    static String selected="";
    static char [][] ticTac;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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
}
