package javaAdv_9;

public abstract class Employee {



    private String name;
    private int age;
    private float salary;
    static float BASE_SALARY_PER_MONTH = 1000f;


    public Employee(String name, int age, float salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public abstract float getSalary();
}
