package javaAdv_9.task2;

import javaAdv_7.Month;

public abstract class BaseEmployee {

    private String name;
    private int age;
    private char gender;
    private float ratePerDay;

    public BaseEmployee(String name, int age, char gender, float ratePerDay) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.ratePerDay = ratePerDay;
    }

    public abstract float getSalary(Month [] monthArr);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public float getRatePerDay() {
        return ratePerDay;
    }

    public void setRatePerDay(float ratePerDay) {
        this.ratePerDay = ratePerDay;
    }
}
