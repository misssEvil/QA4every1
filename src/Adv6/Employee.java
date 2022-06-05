package Adv6;

public class Employee extends Person {

    float salary;

    Employee(){

    }

    public Employee(String name, int age, String gender, float salary) {
        super(name, age, gender);
        this.salary = salary;
    }

    boolean isSameEmployee(Employee employee, String name){

        if(employee.getName().toString().equals(name)) {
            return true;
        }
        else return false;
    }








}
