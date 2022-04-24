package javaAdv_9;

public class Worker extends Employee {

    public Worker(String name, int age, float salary) {
        super(name, age, salary);
    }

    @Override
    public float getSalary() {
        return BASE_SALARY_PER_MONTH;
    }

    public final float getBaseSalary(){
        return BASE_SALARY_PER_MONTH;
    }


}
