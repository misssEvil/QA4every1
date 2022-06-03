package Adv9;


import Adv7.MonthUtils;
import Adv9.task1.Director;
import Adv9.task1.Manager;
import Adv9.task2.Boss2;
import Adv9.task2.Worker2;

public class Main9 {
    public static void main(String[] args) {

        // task1
        Manager m1 = new Manager("Peter", 20, 1000f);
        Manager m2 = new Manager("Ann", 24, 2000f);
        Manager m3 = new Manager("Kate", 50, 3000f);
        Manager m4 = new Manager("Fred", 35, 1500f, 5000);

        System.out.println(m1.getName() + " , " + m1.getSalary());
        System.out.println(m4.getName() + " , " +m4.getSalary());

        Director d1 = new Director("Harry", 28, 0, 9000);
        Director d2 = new Director("Emily", 31, 0, 200);

        System.out.println(d1.getName() + " , " + d1.getSalary());
        System.out.println(d2.getName() + " , " + d2.getSalary());
        System.out.println();

        // task2

        Worker2 w1 = new Worker2("Niji",19, 'M', 1f);
        Worker2 w2 = new Worker2("NyOh", 19, 'F', 2f);
        Boss2 b1 = new Boss2("Pauli", 23, 'N', 4f,0);
        Boss2 b2 = new Boss2("Mitch", 21, 'N', 4f,10);

        System.out.println("Salary report:");
        System.out.println(w2.getName() + "\t \t \tDec = " + w2.getSalary(MonthUtils.Dec));
        System.out.println(" \t \t \t \tfirstQuater = " + w2.getSalary(MonthUtils.firstQuater()));
        System.out.println(" \t \t \t \tsecondQuater = " + w2.getSalary(MonthUtils.secondQuater()));
        System.out.println(" \t \t \t \tthirdQuater = " + w2.getSalary(MonthUtils.thirdQuater()));
        System.out.println(" \t \t \t \tfourthQuater = " + w2.getSalary(MonthUtils.fourthQuater()));
        System.out.println(" \t \t \t \tfirstHalf = " + w2.getSalary(MonthUtils.firstQuater()));
        System.out.println(" \t \t \t \tyear = " + w2.getSalary(MonthUtils.year()));

        System.out.println(b1.getName() + " \t \t\tDec = " + b1.getSalary(MonthUtils.Dec));
        System.out.println(" \t \t \t \tfirstQuater = " + b1.getSalary(MonthUtils.firstQuater()));
        System.out.println(" \t \t \t \tsecondQuater = " + b1.getSalary(MonthUtils.secondQuater()));
        System.out.println(" \t \t \t \tthirdQuater = " + b1.getSalary(MonthUtils.thirdQuater()));
        System.out.println(" \t \t \t \tfourthQuater = " + b1.getSalary(MonthUtils.fourthQuater()));
        System.out.println(" \t \t \t \tfirstHalf = " + b1.getSalary(MonthUtils.firstQuater()));
        System.out.println(" \t \t \t \tyear = " + b1.getSalary(MonthUtils.year()));














    }
}
