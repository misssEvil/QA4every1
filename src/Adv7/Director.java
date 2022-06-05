package Adv7;

public class Director extends Manager{

   // int numberOfSubs;

    Director (){

    }

    public Director(String name, float salary, int numberOfSubs) {
        super(name, salary, numberOfSubs);
    }

    public Float getSalary(){
        if ( numberOfSubs == 0){
            this.salary = BASE_SALARY_PER_MONTH;
        }

        else {
            this.salary = BASE_SALARY_PER_MONTH * (float)(numberOfSubs / 100 * 3) ;
        }
        return salary;
    }
}
