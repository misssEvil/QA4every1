package Adv7;

import Common.Printing;

public class Main7 {
    public static void main(String[] args) {

        Printing.printHW("7.1");
        Printing.printTask("1");

        Employee e1 = new Employee("David", 2000f);

        Employee e2 = new Employee();
        e2.setName("Patrick");
        e2.setSalary(3000f);

        Employee e3 = new Employee("Ari",2500);
        Employee e4 = new Employee("Benhamin", 1700);

        Manager m1 = new Manager();

        m1.setName("Anna");
        m1.setNumberOfSubs(1000);

        Manager m2 = new Manager("Billie", 0f, 1200);
        Manager m3 = new Manager("Finneas", 0f,500);
        Manager m4 = new Manager("Adele", 0f,3000);

       Director d1 = new Director("Harry", 0f, 9000);
       Director d2 = new Director("Emily", 0f, 990);

        Employee [] employeesArr = new Employee[] {e1, e2, e3, e4, m1, m2, m3, m4, d1, d2};

        System.out.println("List of employees:");
        for (Employee employee : employeesArr) {
            System.out.println(employee.getName() +
                    ", salary " + employee.getSalary());
        }
        System.out.println();

        Printing.printTask("2");

        Manager [] managersArr = new Manager[]{m1, m2, m3, m4, d1, d2};

        System.out.println("List of managers:");
        for (Manager manager : managersArr) {
            System.out.println(manager.getName() +
                    ", numberOfSubs " + manager.getNumberOfSubs() +
                    ", salary " + manager.getSalary());
        }

        Printing.printTask("3");
        System.out.println("Searching for an employee, who's name is Ivar...");
        EmployeeUtils.findViaName(employeesArr, "Ivar");

        System.out.println("Searching for an employee, who's name is Ari...");
        EmployeeUtils.findViaName(employeesArr,"Ari");
        System.out.println();

        System.out.println("Searching for an employee, who's name contains 'Harr'");
        EmployeeUtils.findViaSubstring(employeesArr, "Harr");
        System.out.println();

        System.out.println("Calculating salary budget:");
        EmployeeUtils.salaryBudget(employeesArr);
        System.out.println();

        System.out.println("Min salary is " + EmployeeUtils.findMinSalary(employeesArr));
        System.out.println();

        System.out.println("Max salary is " + EmployeeUtils.findMaxSalary(employeesArr));
        System.out.println();

        System.out.println("Min number of subs is " + EmployeeUtils.findMinNumberOfSubs(managersArr));
        System.out.println();

        System.out.println("Max number of subs is " + EmployeeUtils.findMaxNumberOfSubs(managersArr));
        System.out.println();

        Printing.printHW("7.2");

        Worker w1 = new Worker("Luck",19, 'M', 1f);
        Worker w2 = new Worker("Leya", 19, 'F', 2f);
        Boss b1 = new Boss("Antony", 23, 'N', 4f,0);
        Boss b2 = new Boss("Mitch", 21, 'N', 4f,10);


       // MonthUtils mn = new MonthUtils();

        //Month[] period = {mn.Dec, mn.Jan};
        System.out.println(w2.getName() + "'s salary: \tDec = " + w2.getSalary(MonthUtils.Dec));
        System.out.println(" \t \t \t \tfirstQuater = " + w2.getSalary(MonthUtils.firstQuater()));
        System.out.println(" \t \t \t \tsecondQuater = " + w2.getSalary(MonthUtils.secondQuater()));
        System.out.println(" \t \t \t \tthirdQuater = " + w2.getSalary(MonthUtils.thirdQuater()));
        System.out.println(" \t \t \t \tfourthQuater = " + w2.getSalary(MonthUtils.fourthQuater()));
        System.out.println(" \t \t \t \tfirstHalf = " + w2.getSalary(MonthUtils.firstQuater()));
        System.out.println(" \t \t \t \tyear = " + w2.getSalary(MonthUtils.year()));

        System.out.println();






















    }
}
