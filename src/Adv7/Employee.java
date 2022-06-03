package Adv7;


public class Employee {

    private String name;
    float salary;
    static float BASE_SALARY_PER_MONTH = 1000f;
 //   static float BASE_SALARY_PER_DAY = 10f;

    Employee (){

    }



    Employee(String name, float salary){
        this.name = name;
        this.salary = salary;

    }

    String getName(){
        return this.name;
    }

    void setName(String name){
        this.name = name;
    }

    Float getSalary(){
        return this.salary;
    }

    void setSalary(float salary){
        this.salary = salary;
    }

    Float getBaseSalary(){
        return BASE_SALARY_PER_MONTH;
    }






}
