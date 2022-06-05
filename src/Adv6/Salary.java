package Adv6;

public class Salary extends Employee {

    Salary(){

    }


    float getSum(Employee [] empArr){

        float sum = 0;

        for (Employee employee : empArr) {
            sum += sum + employee.salary;
        }

        return sum;
    }







}
