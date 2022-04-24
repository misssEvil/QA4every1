package javaAdv_9.task2;

import javaAdv_7.Month;

public final class Worker2 extends BaseEmployee{

    public Worker2(String name, int age, char gender, float ratePerDay) {
        super(name, age, gender, ratePerDay);
    }

    @Override
    public float getSalary(Month [] monthArr) {
        float salary = 0;

        for (Month month : monthArr) {
            salary = salary + (month.getNumberOfDays() * getRatePerDay());

        }
        return salary;
    }

    public float getSalary (Month month){
        float salary = 0;

        return month.getNumberOfDays() * getRatePerDay();
    }
}
