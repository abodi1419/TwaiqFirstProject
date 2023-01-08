import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
//        writePlease("Welcome to first file\nThis is example file.","Example");
        writeLine("Appended line","Example");
        printFile("Example");

    }

    public static Scanner giveMeFile(String fileName){
        try {
            Scanner sc = new Scanner(new File(fileName));
            return sc;
        }catch (FileNotFoundException ex){
            return null;
        }

    }

    public static void printFile(String fileName){
        Scanner sc = giveMeFile(fileName);
        if(sc!=null){
            while (sc.hasNext()){
                System.out.println(sc.nextLine());
            }
        }else {
            System.err.println("File '"+fileName+"' not found!");
        }
    }
    public static boolean writePlease(String msg, String file){
        try{
            PrintWriter pw = new PrintWriter(new File(file));
            pw.println(msg);
            pw.flush();
            pw.close();
            return true;
        }catch (FileNotFoundException ex){
            return false;
        }
    }

    public static boolean writeLine(String msg, String file){
        try{
            FileWriter pw = new FileWriter(new File(file),true);
            pw.write(msg+"\r\n");
            pw.flush();
            pw.close();
            return true;
        }catch (IOException ex){
            return false;
        }
    }

}