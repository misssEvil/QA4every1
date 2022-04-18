package javaAdv_8;

public class ArrayUtils {

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        // arr1 + arr2 is not working...
        int sum = 0;

        for (int i = 0; i < arr1.length; i++){
            sum = sum + arr1[i] + arr2[i];
        }

        return sum;
    }

    public static int [] reverseArr(int n){
        int [] reverse = new int[n];

        for (int i = 0; i < reverse.length; i++){
            reverse[i] = n;
            n--;
        }
        return reverse;
    }

    public static String[] stringToArray(String s) {
        //String [] str = s.split(" ");

        return s.split(" ");




    }

}
