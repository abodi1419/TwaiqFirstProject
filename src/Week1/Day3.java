package Week1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====================== First & last are same? ======================");
        firstTask();
        enterPrompt(sc);

        System.out.println("====================== Three largest numbers ======================");
        secondTask();
        enterPrompt(sc);

        System.out.println("====================== Numbers greater than average ======================");
        thirdTask();
        enterPrompt(sc);

        System.out.println("====================== First and last comparison which is greater ======================");
        fourthTask();
        enterPrompt(sc);

        System.out.println("====================== First and last swap in a new array ======================");
        fifthTask();
        enterPrompt(sc);

        System.out.println("====================== Print same largest strings in an array ======================");
        sixthTask();
        enterPrompt(sc);

        System.out.println("====================== Create and manipulate an array ======================");
        n7Task(sc);

        System.out.println("====================== Count occurrences of array ======================");
        n8Task(sc);
        sc.nextLine();
        enterPrompt(sc);

        System.out.println("====================== Bring odd to the beginning ======================");
        n9Task();
        enterPrompt(sc);

        System.out.println("====================== Check equality of two arrays ======================");
        n10Task();

//        printArr(arr);
//        System.out.print("Second smallest element is: ");
//        System.out.println(secondSmallest(arr));
//        System.out.println("With duplicate: ");
//        printArr(arr);
//        ArrayList<Integer> arr1 = removeDuplicate(arr);
//        System.out.println("Without duplicate: ");
//        printArr(arr1);
//        ArrayList<String> names = new ArrayList<String>();
//        names.add("Abdullah");
//        names.add("Abdullah");
//        names.add("Ali");
//        names.add("Ahmed");
//        names.add("Ahmed");
//        System.out.println("With duplicate: ");
//        printArr(names);
//        System.out.println("Without duplicate: ");
//        printArr(removeDuplicate(names));


    }

    private static void enterPrompt(Scanner sc) {
        System.out.println("Press enter to continue..");
        sc.nextLine();
    }

    public static void firstTask(){
        int [] arr = {50, -20, 0, 30, 40, 60, 10};
        printArr(arr);
        if(arr.length>=2){
            System.out.println("Are same? "+(arr[0]==arr[arr.length-1]));
        }
    }

    public static void secondTask(){
        int [] arr = {1, 4, 17, 7, 25, 3, 100};
        if (arr.length<3){

        }else {
            printArr(arr);
            Arrays.sort(arr);
            System.out.println("3 largest elements of the said array are: "+arr[arr.length-1]+" "+arr[arr.length-2]+" "+arr[arr.length-3]);
        }

    }

    public static void thirdTask(){
        int [] arr = {1, 4, 17, 7, 25, 3, 100};
        double average = getAverage(arr);
        System.out.print("The average of the said array is: "+average+" The numbers in the said array that are greater than the average are: ");
        for (int i: arr){
            if(i>average){
                System.out.print(i+" ");
            }
        }
        System.out.println();

    }

    public static void fourthTask(){
        int [] arr = {20,30,40};
        System.out.println("Larger value between first and last element: "+((arr[0]>arr[arr.length-1])?arr[0]:arr[arr.length-1]));
    }

    public static void fifthTask(){
        int [] arr = {20, 30,50, 40,70};
        System.out.println("Original array: ");
        printArr(arr);
        int [] newArr = new int[arr.length];
        newArr[0] = arr[arr.length-1];
        newArr[newArr.length-1] = arr[0];
        for (int i=1; i<arr.length-1;i++){
            newArr[i] = arr[i];
        }
        System.out.println("New array after swapping the first and last elements: ");
        printArr(newArr);
    }

    public static void sixthTask(){
        String [] arr = { "cat", "dog", "red", "is", "am"};
        System.out.println("Original array: ");
        printArr(arr);
        int maxLength = 0;
        for(String s: arr){
            if(s.length()>maxLength){
                maxLength = s.length();
            }
        }
        System.out.print("Result: ");
        String output="";
        for (String s: arr){
            if(s.length()==maxLength){
                output += "\""+s+"\", ";
            }
        }
        output = output.substring(0,output.length()-2);
        System.out.println(output);
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

    public static void n8Task(Scanner sc){
        int [] arr = {1,1,1,3,3,5};
        System.out.println("Original array: ");
        printArr(arr);




        while (true){
            try {
                System.out.print("Enter the number to look for: ");
                int number = Integer.parseInt(sc.next());
                int occurrences=0;
                for (int i=0; i<arr.length;i++){
                    if(arr[i]==number){
                        occurrences++;
                    }
                }
                System.out.println("Output");

                System.out.println("\t"+number+" occurs "+occurrences+" times");

                break;
            }catch (NumberFormatException e){
                System.err.println("Please enter an integer number!");
            }

        }



    }

    public static void n9Task(){
        int [] arr = {2,3,40,1,5,9,4,10,7};
        System.out.println("Original array: ");
        printArr(arr);
        for (int i=0; i<arr.length;i++){
            if(arr[i]%2!=0){
                continue;
            }
            for (int j=i+1;j<arr.length;j++){
                if(arr[j]%2!=0){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j] = temp;
                    break;
                }
            }
        }
        System.out.println("Output");
        printArr(arr);
    }

    public static void n10Task(){
        int [] arr1 = {1,2,3,4,5};
        System.out.println("First array: ");
        printArr(arr1);
        int [] arr2 = {1,3,3,4,5};
        System.out.println("Second array: ");
        printArr(arr2);
        boolean isEqual = true;
        if(arr1.length==arr2.length){
            for (int i=0;i<arr1.length;i++){
                if(arr1[i]!=arr2[i]){
                    isEqual = false;
                }
            }
        }
        System.out.println("Equality output: "+isEqual);
    }
    public static double getAverage(int [] arr){
        int sum=0;
        for (int i: arr){
            sum+=i;
        }
        return sum/arr.length*1.0;
    }



    public static int secondSmallest(int [] arr){
        int min =arr[0];

        for (int i=0; i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        int secondMin = 1000000;
        for (int i=0; i<arr.length;i++){
            if(arr[i]<secondMin && arr[i]>min){
                secondMin=arr[i];
            }
        }
        return secondMin;

    }
    public static ArrayList<Integer> removeDuplicate(int [] arr){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i=0; i<arr.length; i++){
            if(!arrayList.contains(arr[i])){
                arrayList.add(arr[i]);
            }
        }
        return arrayList;
    }

    public static ArrayList removeDuplicate(ArrayList arr){
        ArrayList arrayList = new ArrayList<>();
        for (int i=0; i<arr.size(); i++){
            if(arrayList.indexOf(arr.get(i))==-1){
                arrayList.add(arr.get(i));
            }
        }
        return arrayList;
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
    public static void printArr(String [] arr){
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

    public static void printArr(ArrayList arr){
        System.out.print("arr: [\n");
        for (int i=0;i<arr.size();i++){
            System.out.print("\t"+i+" => ");
            System.out.print(arr.get(i));
            if(i!=arr.size()-1){
                System.out.print(", \n");
            }
        }
        System.out.println("\n]");
    }
    public static void reverseArray(int [] arr){
        for (int i=0;i<arr.length/2;i++){
            int temp = arr[arr.length-1-i];
            arr[arr.length-1-i] = arr[i];
            arr[i]=temp;
        }
    }

    public static int searchArray(int [] arr, int key){
        for (int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
}
