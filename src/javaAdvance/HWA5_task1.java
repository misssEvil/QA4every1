package javaAdvance;


import Common.Printing;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HWA5_task1 {
    public static void main(String[] args) {

        Printing.Print(1);
        System.out.println("Doing simple math operations");
        System.out.println("5 + 6 = " + MathOperations.Addition(5,6));
        System.out.println("45 - 19 =" + MathOperations.Subtraction(45,19));
        System.out.println("23 * 7 = " + MathOperations.Multiplication(23,7));
        System.out.println("89 / 5 = " + MathOperations.Division(89,5));

        Printing.Print(2);
        System.out.println(countingSheep(12));

        Printing.Print(3);
        System.out.println(doubleInteger(5));

        Printing.Print(4);
        System.out.println(numberToString(562));

        Printing.Print(5);
        System.out.println(isLove(7,8));




    }

    public static String countingSheep(int num){
        String s = "";

        for (int i = 1; i < num + 1; i++){
            s = s + i + " sheep...";
        }

        return s;
    }

    public static String countingSheep2(int num){
        String s = "";
        int i = 0;
        while (i < num){
            s += (i+1) + " sheep...";
            i ++;
        }
        return s;
    }

    public static String countingSheep3(int num){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= num; i++){
            stringBuilder.append(i).append(" sheep...");
        }
        return stringBuilder.toString();
    }

    public static String countingSheep4(int num){
        return IntStream.rangeClosed(1, num)
                .mapToObj(i -> i + " sheep...")
                .collect(Collectors.joining());
    }

    public static int doubleInteger(int i) {
        return i*2;

    }

    public static String numberToString(int num) {
        String numberToString = Integer.toString(num);

        return Integer.toString(num);
    }

    public static boolean isLove(final int flower1, final int flower2) {

        return ((flower1 % 2 == 0 && flower2 % 2 == 1) || ( flower1 % 2 == 1 && flower2 % 2 == 0));

    }


}
