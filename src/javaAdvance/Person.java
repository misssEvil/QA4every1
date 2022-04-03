package javaAdvance;

public class Person {

    private String name;
    private int age;
    private String gender;

    Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;

    }

    String getName(){
        if (gender == "female"){
            return "Mrs. " + name;
        }
        else
            return "Mr. " + name;

    }
}
