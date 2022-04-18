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
        for (String s : arr) {
            System.out.print(s + ",");
        }
        System.out.println();
    }

    public  static void printingArr(int [] arr){
        for (int j : arr) {
            System.out.print(j + ",");
        }
        System.out.println();
    }

    public  static void printingArr(boolean [] arr){
        for (boolean b : arr) {
            System.out.print(b + " ");
        }
        System.out.println();
    }


}
