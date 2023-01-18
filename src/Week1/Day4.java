package Week1;

import java.util.Scanner;
import java.util.regex.*;
public class Day4 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile(".s");//. represents single character
        String pass = new Scanner(System.in).nextLine();


        char [] chars = pass.toCharArray();
        System.out.println(has2Digits(chars));

//3rd way


    }

    public static boolean has2Digits(char [] arr){
        if(arr.length<10){
            return false;
        }
        int counter=0;
        int counter1=0;
                // 65 - 90          97 - 122
        for (char c: arr){
            if(c<58 && c>47){
                counter++;
            }else {
                if ((int)c>64 && (int)c<91 || (int)c>96 && (int)c<123){
                    counter1++;
                }else {
                    return false;
                }
            }
        }
        if(counter>1 && counter1>1){
            return true;
        }
        return false;
    }
}
