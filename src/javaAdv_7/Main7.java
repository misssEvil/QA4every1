package javaAdv_7;

import Common.Printing;

public class Main7 {
    public static void main(String[] args) {

        Printing.PrintHW("7.1");
        Printing.PrintTask("1");

        Employee e1 = new Employee("David", 2000f);

        Employee e2 = new Employee();
        e2.setName("Patrick");
        e2.setSalary(3000f);

        Employee e3 = new Employee("Ari",2500);
        Employee e4 = new Employee("Benhamin", 1700);

        Employee [] employeesArr = new Employee[] {e1, e2, e3, e4};


        System.out.println(e1.getName() + " " + e1.getSalary());
        System.out.println(e2.getName() + " " + e2.getSalary());

        Printing.PrintTask("2");
        Manager m1 = new Manager();

        m1.setName("Anna");
        //m1.setBaseSalary(3000f);
        m1.setNumberOfSubs(1000);

        System.out.println("Manager: " + m1.getName() +
                ", number of subs " + m1.numberOfSubs +
                ", baseSalary: " + m1.getBaseSalary() +
                " total salary: " + m1.getSalary());
        //m1.getSalary();

        Manager m2 = new Manager("Billie", 0f, 1200);
        System.out.println("Manager: " + m2.getName() +
                ", number of subs " + m2.numberOfSubs +
                " total salary: " + m2.getSalary());

       Director d1 = new Director("Harry", 0f, 9000);
        Director d2 = new Director("Emily", 0f, 0);

        System.out.println("Director : " + d1.getName() +
                ", number of subs " + d1.numberOfSubs +
                " total salary: " + d1.getSalary());


        System.out.println("Director : " + d2.getName() +
                ", number of subs " + d2.numberOfSubs +
                " total salary: " + d2.getSalary());


        Printing.PrintTask("3");
        System.out.println("Searching for employee, who's name is Ivar...");
        EmployeeUtilities.findViaName(employeesArr, "Ivar");

        System.out.println("Searching for employee, who's name is Ari...");
     //  System.out.println(EmployeeUtilities.findViaName(employeesArr, "David"));
        EmployeeUtilities.findViaName(employeesArr,"Ari");






    }
}
