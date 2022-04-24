package javaAdv_9.task1;

public final class Director extends Employee {

    private int numOfSubs;
    private static final int SALARY_COEF = 9;

    public Director(String name, int age, float salary) {
        super(name, age, salary);
    }

    @Override
    public float getSalary() {
        if (numOfSubs == 0) {
            return BASE_SALARY_PER_MONTH;
        } else {
            return BASE_SALARY_PER_MONTH * numOfSubs / 100 * SALARY_COEF;
        }
    }

}
