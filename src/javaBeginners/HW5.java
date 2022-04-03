package javaBeginners;
import java.text.DecimalFormat;
import java.util.Arrays;

import Common.Printing;

//Все результаты вашей работы необходимо выводить на печать с номером задания.
// Результаты должны быть протестированы, для этого необходимо создать
// метод с названием verifyEquals(expectedResult, actualResult)

public class HW5 {
    public static void main(String[] args)   {
        /*

        Printing.Print(2);
        System.out.println(dayOfWeek(5));

        Printing.Print(3);
        System.out.println(largestValue(10,2,58));

        Printing.Print(4);
        System.out.println(smallestValue(10, 64, 1));
        System.out.println(smallestValue2(40, 14, -5));
        System.out.println(Verification.verifyEquals(1, smallestValue(10, 64, 1)));

        Printing.Print(5);
        System.out.println(avgTemp(37.2, 37.4, 37.1, 37.3, 37.5) + " C");
        System.out.println("Purchase amount: " + findTotal(10.99, 4) + "$");



        Printing.Print(6);
        System.out.println(printPrice(472.99f));

        Printing.Print(7);
        System.out.println(printQuantity(17.010f));

        Printing.Print(8);
        System.out.println("Total: " + findTotal(5.99, 6));

         */

        Printing.PrintTask(9);
        System.out.println(printReceipt("apples", 2.15f, 3));




       // System.out.println(str2);



    }


    public static String dayOfWeek(int day){

        String [] weekDays = new String[] {"Mon", "Tue", "Wed", "Thur", "Fri", "Sat", "Sun"};
        return "It's " + weekDays[(day -1)] ;
    }



    public static Integer largestValue(int x, int y, int z){
        
        int largest = 0;
        int [] array = new int[] {x, y,z};
        Arrays.sort(array);
        return largest = array[2];

    }


     public static Integer smallestValue(int a, int b, int c){
        int smallest = 0;

        if ( b > a && c > a ){
            smallest = a;
        }

        else if ( a > b && c > b){
            smallest = b;
        }
            else smallest = c;

        return smallest;
    }

    public static Integer smallestValue2(int a, int b, int c){

        return Math.min(Math.min(a, b), c);
    }



    public static Double avgTemp(double a, double b, double c, double d, double e){
        double sum = 0;
        double temp [] = new double[] {a, b, c, d, e};

        for (int i =0; i <  temp.length; i++){
            sum += temp[i];
        }
        return sum / temp.length;

    }


    public static String printPrice(float a){

        DecimalFormat dkop = new DecimalFormat("#");
        String s = (int) a + " руб " + dkop.format(a * 100 - (int) a * 100 ) +  " коп";
        return s;

    }

    public static String printQuantity(float a){

        DecimalFormat dgramm = new DecimalFormat("#");
        String s = (int) a + " kg " + dgramm.format(a * 1000 - (int) a * 1000 ) +  " gr";
        return s;

    }


    public static Double findTotal(double price, double quantity){
        return price * quantity;

    }

    public static String printReceipt(String itemName, float price, double quantity)  {

        DecimalFormat dnum = new DecimalFormat("#.##");



        return itemName + "\n"
                + "Price "
                + "Quantity "

                ;






    }








    }











