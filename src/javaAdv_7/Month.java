package javaAdv_7;

public class Month {

    private String nameOfMonth;
    private int numberOfDays;

    public Month(String nameOfMonth, int numberOfDays) {
        this.nameOfMonth = nameOfMonth;
        this.numberOfDays = numberOfDays;
    }

    public String getNameOfMonth() {
        return nameOfMonth;
    }

    public void setNameOfMonth(String nameOfMonth) {
        this.nameOfMonth = nameOfMonth;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }


}
