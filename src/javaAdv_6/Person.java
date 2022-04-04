package javaAdv_6;

public class Person {

    protected String name;
    protected int age;
    protected String gender;

    Person(){

    }

    Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;

    }

    String getName(){  // array for gender values
        if (gender == "female"){
            return "Mrs. " + name;
        }
        else
            return "Mr. " + name;

    }
}
