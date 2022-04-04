package javaAdv_6;

public class Employee extends Person {

    protected float salary;

    Employee(){

    }

    Employee(String name, int age, String gender, float salary){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;

    }

    boolean isSameEmployee(Employee employee, String name){

        if( employee.name.toString() == name) {
            return true;
        }
        else return false;
    }








}
