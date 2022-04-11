package javaAdv_6;

import Common.Printing;
import javaAdv_5.HWA5;
import javaAdv_5.MathOperations;

public class Main6 {
    public static void main(String[] args) {

        Printing.PrintHW("6.1");


        Printing.PrintHW("6.1");
        Printing.PrintTask("1");
        Block block1 = new Block(new int[] {2,2,2});
        System.out.println("Volume of the block is equal to " + block1.getVolume());
        System.out.println("Surface area of the block is equal to " + block1.getSurfaceArea());

        Printing.PrintHW("6.2");
        Printing.PrintTask("1");
        Person p1 = new Person("Emma", 16, "female");
        Person p2 = new Person("Elio", 19,"male");
        System.out.println(p1.getName());
        System.out.println(p2.getName());

        Printing.PrintTask("2");
        Employee e1 = new Employee("Patrick", 23, "male", 2000f);
        Employee e2 = new Employee("James", 27, ",male", 1700f);
        Employee e3 = new Employee("Charly", 21, "female", 4200f);

        System.out.println(e1.isSameEmployee(e1,"Patrick"));
        System.out.println(e2.isSameEmployee(e2,"Gemma"));

        Printing.PrintTask("3");
        Employee [] empArr = new Employee[] {e1, e2, e3};
        Salary s = new Salary();
        System.out.println("Sum salary = " + s.getSum(empArr));







    }



}

