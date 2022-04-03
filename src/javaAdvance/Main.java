package javaAdvance;

import Common.Printing;

public class Main {
    public static void main(String[] args) {

        Printing.PrintHW(5);
        Printing.PrintTask(1);
        System.out.println("Doing simple math operations");
        System.out.println("5 + 6 = " + MathOperations.Addition(5,6));
        System.out.println("45 - 19 =" + MathOperations.Subtraction(45,19));
        System.out.println("23 * 7 = " + MathOperations.Multiplication(23,7));
        System.out.println("89 / 5 = " + MathOperations.Division(89,5));

        Printing.PrintTask(2);
        System.out.println(HWA5.countingSheep(12));

        Printing.PrintTask(3);
        System.out.println(HWA5.doubleInteger(5));

        Printing.PrintTask(4);
        System.out.println(HWA5.numberToString(562));

        Printing.PrintTask(5);
        System.out.println(HWA5.isLove(7,8));

        Printing.PrintHW(6);
        Block block1 = new Block(new int[] {2,2,2});
        System.out.println(block1.getVolume());
        System.out.println(block1.getSurfaceArea());

        Person p1 = new Person("Emma", 16, "female");
        Person p2 = new Person("Elio", 19,"male");

        System.out.println(p1.getName());
        System.out.println(p2.getName());
    }



}

