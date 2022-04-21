package Common;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrUtils {
    public static int findAvgValue(int[] arr) {
        int avg = 0;
        for (int j : arr) {
            avg = avg + j;
        }
        return avg / arr.length;
    }

    public static int findMinValue(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMaxValue(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void fillWithRandoms(int[] arr, int upperBound) {
        Random rndm = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rndm.nextInt(upperBound);
        }
    }

    public static void fillWithRandoms(int upperBound, int arrSize){
        Random rndm = new Random();
        List <Integer> arr = new ArrayList<>();
        for (int i = 0; i < arrSize; i++){
            arr.add(rndm.nextInt(upperBound));
        }
        System.out.println(arr);

    }

    public static void fillWithEvenRandoms(int[] arr, int upperBound) {
        Random rndm = new Random();
        for (int i = 0; i < arr.length; i++) {
            int element = rndm.nextInt(upperBound);
            if (element % 2 == 0) {
                arr[i] = element;
            }
            else i = i - 1;
        }
    }

    public static void fillWithOddRandoms(int[] arr, int upperBound) {
        Random rndm = new Random();
        for (int i = 0; i < arr.length; i++) {
            int element = rndm.nextInt(upperBound);
            if (element % 2 == 1) {
                arr[i] = element;
            }
            else i = i - 1;
        }
    }

    public static void fillWithRandomsRange(int[] arr, int min, int max){

        for (int i = 0; i < arr.length; i++){
            arr[i] = (int) Math.floor(Math.random()*(max-min+1)+min);
        }
    }

       public static List <Integer> fillWithRandomsRange(int size, int min, int max){
        List <Integer> list2 = new ArrayList<>();

           for  (int i = 0; i < size; i++){
               list2.add((int)Math.floor(Math.random()*(max-min+1)+min));

           }
           return list2;
    }
    public static List <Integer> fillWithRandomsRange( List <Integer> list, int size, int min, int max){
        for  (int i = 0; i < size; i++){
            list.add((int) Math.floor(Math.random()*(max-min+1)+min));

        }
        return list;
    }



    public static int [] multArr(int[] arr, double multiplicator){
        for (int i = 0; i < arr.length; i++){
            arr[i] = arr[i] * (int) multiplicator;
        }
        return arr;
    }

    public static int numberOfEvenNums(int[] arr){
        int counter = 0;
        for (int j : arr) {
            if (j % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int numberOfOddNums(int[] arr){
        int counter = 0;
        for (int j : arr) {
            if (j % 2 != 0) {
                counter++;
            }
        }
        return counter;
    }
}
