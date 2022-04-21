package javaBeginners;

import java.util.ArrayList;
import java.util.List;

public class Helper {

    public static int [] toArray(int a, int b, int c, int d, int f){
        return new int[]{a, b, c, d, f };
    }
    public static double [] toArray(double a, double b, double c, double d, double f){
        return new double []{a, b, c, d, f };
    }
    public static String [] toArray(String w1, String w2, String w3, String w4, String w5){
        return new String [] {w1, w2, w3, w4, w5};
    }

    public static boolean [] numsInArrMore(int [] arr, int checkNum){
        boolean [] result = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > 10){
                result[i] = true;
            }
        }
        return result;
    }
    public static String arrToString(String [] arr){
        String str = "";
        for (String s : arr) {
            str = str + s + " ";
        }
    return str;
    }
    public static int SumHalfArr(int [] arr){
        int sum = 0;
        for (int i = arr.length/2; i < arr.length; i++) {  // Math round
        sum = sum + arr[i];
        }
        return sum;
    }
    public static int [] multTable(int num){
        int [] table = new int[8];
        int multiplicand = 2;
        if (num > 0 && num < 10){
            for (int i = 0; i < table.length; i++){
                table[i] = multiplicand * num;
                multiplicand++;
            }
        }
        else System.out.println("Input num is out of range!");
        return table;
    }
    public static int [] evenSeq(int end){
        int [] arr = new int[end/2 + 1];
        arr[0] = 0;
        for (int i = 1; i < arr.length ; i++){
            arr[i] = arr[i-1] + 2;
        }
        return arr;
    }

    public static List <Integer> checkArr(int [] arr){

        List <Integer> evenList = new ArrayList<>();
        List <Integer> oddList = new ArrayList<>();

        for (int i= 0; i < arr.length; i++){
            if (arr[i] % 2 == 0){
                evenList.add(arr[i]);
            }
            else {
                oddList.add(arr[i]);
            }
        }

        if (evenList.size() > oddList.size()){
            return evenList;
        }

        if (evenList.size() == oddList.size()){
            evenList.clear();
            evenList.add(null);
            return evenList;
        }
        return oddList;
    }

    public static List <Integer> listOfNumsCapacity(int l, int d){
        int min = (int)Math.pow(10, (d-1));
        int max = (int)(Math.pow(10,d) - 1);
        List <Integer> list = new ArrayList<>();

        for  (int i = 0; i < l; i++){
            list.add((int) Math.floor(Math.random()*(max-min+1)+min));

        }
        return list;

    }

    public static List <Integer> keepDigCapacity(List <Integer> list, int d ){
        int min = (int)Math.pow(10, (d-1));
        int max = (int)(Math.pow(10,d) - 1);

        for (int i = 0; i < list.size(); i++){
           if ((list.get(i) > min) && (list.get(i) < max)){
                    //
               //System.out.println(list.get(i));
           }
                else {
                list.remove(i);
                i--;
            }
        }
        return list;
    }

    public static List <Integer> diffBetweenTensOnes (List <Integer> arrList){
        for (int i = 0; i < arrList.size(); i++){
            System.out.print(arrList.get(i)/10 + "-" + (arrList.get(i) - arrList.get(i)/10*10) + " , ");
            arrList.set(i, (arrList.get(i)/10 - (arrList.get(i) - arrList.get(i)/10*10)));

        }
        System.out.println();
        return arrList;
    }


}
