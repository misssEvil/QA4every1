package javaAdv_7;

public class Boss extends Worker{

    int numberOfSubs;

    public Boss (String name, int age, char gender, float ratePerDay, int numberOfSubs){
        super(name, age, gender, ratePerDay);
        this.numberOfSubs = numberOfSubs;
    }

    public int getNumberOfSubs() {
        return numberOfSubs;
    }

    public void setNumberOfSubs(int numberOfSubs) {
        this.numberOfSubs = numberOfSubs;
    }

    float getSalary (Month [] monthArr){
        float salary = 0;

        for (Month month : monthArr) {
            salary = salary + (month.getNumberOfDays() * getRatePerDay());

        }
        return salary + (salary * getNumberOfSubs() / 100);
    }





}
