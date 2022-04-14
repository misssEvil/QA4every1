package Common;

public class Printing {

    public static void printHW(String t){

        System.out.println();
        System.out.println("\u001B[35m*** Home work number " + t + " ***\u001B[0m");
    }

    public static void printTask(String t){

        System.out.println();
        System.out.println("\u001B[36m*** Task number " + t + " ***\u001B[0m");
    }

    public  static void printingArr(String [] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public  static void printingArr(int [] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public  static void printingArr(boolean [] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


}
