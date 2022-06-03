package Adv7;

public class Worker {

    private String name;
    private int age;
    private char gender;
    private float ratePerDay;
 //   static float BASE_SALARY_PER_DAY = 1f;

    public Worker(String name, int age, char gender, float ratePerDay) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.ratePerDay = ratePerDay;
    }

    public float getRatePerDay() {
        return ratePerDay;
    }

    public void setRatePerDay(float ratePerDay) {
        this.ratePerDay = ratePerDay;
    }

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

     public float getSalary (Month [] monthArr){
        float salary = 0;

         for (Month month : monthArr) {
             salary = salary + (month.getNumberOfDays() * getRatePerDay());

         }
        return salary;
    }

    public float getSalary (Month month){
        float salary = 0;

        return month.getNumberOfDays() * this.ratePerDay;
    }








}
