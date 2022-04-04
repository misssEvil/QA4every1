package javaAdv_6;

public class Salary extends Employee {

    Salary(){

    }


    float getSum(Employee [] empArr){

        float sum = 0;

        for(int i = 0; i < empArr.length; i ++){
            sum += sum + empArr[i].salary;
        }

        return sum;
    }







}
