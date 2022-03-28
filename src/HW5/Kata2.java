package HW5;
//https://www.codewars.com/kata/5b077ebdaf15be5c7f000077/train/java
//Task:
//Given a non-negative integer, 3 for example, return a string with a murmur:
// "1 sheep...2 sheep...3 sheep...". Input will always be valid, i.e. no negative integers.

public class Kata2 {
    public static void main(String[] args) {
        String s = " sheep...";
        int num = 7;

        if (num > 0){
            for (int i = 0; i < num + 1; i++){
                System.out.print(i + s);
            }

        }
        else {
            System.out.println("");
        }

    }






}
