package Adv7;

public class Manager extends Employee {

    int numberOfSubs;

    Manager(){

    }

    public Manager(String name, float salary, int numberOfSubs) {
        super(name, salary);
        this.numberOfSubs = numberOfSubs;
    }

    void setNumberOfSubs(int numberOfSubs){
        this.numberOfSubs = numberOfSubs;
    }

    int getNumberOfSubs(){
        return numberOfSubs;
    }



    public Float getSalary(){
        if ( numberOfSubs == 0){
            this.salary = BASE_SALARY_PER_MONTH;
        }

        else {
        this.salary = BASE_SALARY_PER_MONTH * (float) (numberOfSubs / 100 * 3) ;
        }
        return salary;
    }









}
