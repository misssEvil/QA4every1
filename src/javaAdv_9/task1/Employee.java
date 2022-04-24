package javaAdv_9.task1;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public static float getBaseSalaryPerMonth() {
        return BASE_SALARY_PER_MONTH;
    }

    public static void setBaseSalaryPerMonth(float baseSalaryPerMonth) {
        BASE_SALARY_PER_MONTH = baseSalaryPerMonth;
    }
}
