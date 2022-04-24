package javaAdv_9;

public class Main9 {
    public static void main(String[] args) {

        Manager m1 = new Manager("Peter", 20, 1000f);
        Manager m2 = new Manager("Ann", 24, 2000f);
        Manager m3 = new Manager("Kate", 50, 3000f);
        Manager m4 = new Manager("Fred", 35, 1500f, 5000);

        System.out.println(m4.getSalary());
        System.out.println(m3.getSalary());








    }
}
