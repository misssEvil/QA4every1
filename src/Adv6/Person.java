package Adv6;

public class Person {

    private String name;
    private int age;
    private String gender;

    Person(){

    }

    Person(String name){
        this.name = name;
    }

    Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;

    }

    String getName(){  // array for gender values
        if (gender.equals("female")) {
            return "Mrs. " + name;
        }
        else
            return "Mr. " + name;

    }
}
