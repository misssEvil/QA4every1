package javaBeginners;

public class HW7 {

    public static int amountOfCatsByColor(String[] arr, String str) {
        int amnt = 0;
        for (String s : arr) {
            if (s.equals(str)) {
                amnt += 1;
            }
        }
        return amnt;
    }

}
