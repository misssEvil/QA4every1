package javaBeginners;
import java.sql.SQLOutput;
import java.util.Arrays;

//Все результаты вашей работы необходимо выводить на печать с номером задания.
// Результаты должны быть протестированы, для этого необходимо создать
// метод с названием verifyEquals(expectedResult, actualResult)

public class HW5 {
    public static void main(String[] args) {

        Print.Print(2);

        System.out.println(dayOfWeek(5));

        Print.Print(3);
        System.out.println(largestValue(10,2,58));

        Print.Print(3);
        System.out.println(smallestValue(10, 64, 1));
        System.out.println(smallestValue2(40, 14, -5));
        System.out.println(avgTemp(37.2, 37.4, 37.1, 37.3, 37.5) + " C");
        System.out.println("Purchase amount: " + findTotal(10.99, 4) + "$");
        System.out.println(Verification.verifyEquals(1, smallestValue(10, 64, 1)));
    }

    // 2. Написать метод, который принимает на вход число от 1 до 7  и возвращает день недели.
    public static String dayOfWeek(int day){

        String [] weekDays = new String[] {"Mon", "Tue", "Wed", "Thur", "Fri", "Sat", "Sun"};
        return "It's " + weekDays[(day -1)] ;
    }


    // 3. Given three values x, y, z, determine the largest value and assign this value to the variable largest
    public static Integer largestValue(int x, int y, int z){
        
        int largest = 0;
        int [] array = new int[] {x, y,z};
        Arrays.sort(array);
        return largest = array[2];

    }


    // 4. Using nested if statement, write a fragment of code that prints the smallest value contained
    // in the variables a, b, c
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
        int smallest = Math.min(Math.min(a, b), c);
        return smallest;
    }


    // 5. Написать алгоритм вычисления среднего значения из 5 показателей температуры тела кота.
    public static Double avgTemp(double a, double b, double c, double d, double e){
        double sum = 0;
        double temp [] = new double[] {a, b, c, d, e};

        for (int i =0; i <  temp.length; i++){
            sum += temp[i];
        }
        return sum / temp.length;

    }


    // 6. Написать метод, который принимает на вход десятичное число (например, 10.75),
    // и возвращает строку “10 руб 75 коп”.
    public static String printPrice(double a){
        String s = (int) a + "руб ";


        return s;
    }

    // 7. Написать метод, который принимает на вход десятичное число и возвращает строку “10 кг 75 гр”.

    // 8. Написать метод, который принимает на вход десятичное число (например, 10.75),
    // и возвращает строку “10 руб 75 коп”.

    // 9. Написать метод, который принимает на вход 2 параметра -  цену и количество товара (может быть вес товара, или количество в штуках).
    // Алгоритм возвращает сумму покупки в виде десятичного числа.

    public static Double findTotal(double price, double quantity){
        return price * quantity;

    }






    }











