package javaBeginners;

import Common.Printing;
import java.util.Random;

public class HW7 {

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

    public static int amountOfCatsByColor(String[] arr, String str) {
        int amnt = 0;
        for (String s : arr) {
            if (s.equals(str)) {
                amnt += 1;
            }
        }
        return amnt;
    }

    public static void fillArrayWithRandoms(int[] arr, int upperBound) {
        Random rndm = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rndm.nextInt(upperBound);
        }
    }

    public static void fillArrayWithEvenRandoms(int[] arr, int upperBound) {
        Random rndm = new Random();
        for (int i = 0; i < arr.length; i++) {
            int element = rndm.nextInt(upperBound);
            if (element % 2 == 0) {
                arr[i] = element;
            }
            else i = i - 1;
        }
    }

    public static void fillArrayWithOddRandoms(int[] arr, int upperBound) {
        Random rndm = new Random();
        for (int i = 0; i < arr.length; i++) {
            int element = rndm.nextInt(upperBound);
            if (element % 2 == 1) {
                arr[i] = element;
            }
            else i = i - 1;
        }
    }

    public static void fillArrayRandomWideRange(int [] arr, int min, int max){

        for (int i = 0; i < arr.length; i++){
            int element = (int) Math.floor(Math.random()*(max-min+1)+min);
            if (element % 2 == 1) {
                arr[i] = -element;
            }
            else i = i - 1;
        }
    }
}
