package Adv5;

import Common.Printing;

public class Main5 {
    public static void main(String[] args) {

        Printing.printHW("5");
        Printing.printTask("1");
        System.out.println("Doing simple math operations");
        System.out.println("5 + 6 = " + MathOperations.Addition(5,6));
        System.out.println("45 - 19 =" + MathOperations.Subtraction(45,19));
        System.out.println("23 * 7 = " + MathOperations.Multiplication(23,7));
        System.out.println("89 / 5 = " + MathOperations.Division(89,5));

        Printing.printTask("2");
        System.out.println(HWA5.countingSheep(12));

        Printing.printTask("3");
        System.out.println(HWA5.doubleInteger(5));

        Printing.printTask("4");
        System.out.println(HWA5.numberToString(562));

        Printing.printTask("5");
        System.out.println(HWA5.isLove(7,8));
    }
}
