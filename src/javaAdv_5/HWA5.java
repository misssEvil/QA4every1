package javaAdv_5;


import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HWA5 {

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
