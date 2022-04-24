package javaAdv_9.task2;

import javaAdv_7.Month;

public final class Boss2 extends BaseEmployee {

    private int numberOfSubs;

    public Boss2(String name, int age, char gender, float ratePerDay, int numberOfSubs) {
        super(name, age, gender, ratePerDay);
        this.numberOfSubs = numberOfSubs;
    }

    public int getNumberOfSubs() {
        return numberOfSubs;
    }

    public void setNumberOfSubs(int numberOfSubs) {
        this.numberOfSubs = numberOfSubs;
    }

    @Override
    public float getSalary(Month [] monthArr) {
        float salary = 0;

        for (Month month : monthArr) {
            salary = salary + (month.getNumberOfDays() * getRatePerDay());

        }
        return salary + (salary * getNumberOfSubs() / 100);
    }

    public float getSalary (Month month){
        float salary = 0;

        return month.getNumberOfDays() * getRatePerDay();
    }


}
