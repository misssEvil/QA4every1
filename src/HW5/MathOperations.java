package HW5;
//https://www.codewars.com/kata/53ee5429ba190077850011d4/train/java
//You need to double the integer and return it

public class MathOperations {



    public static int doubleInteger(int i) {
        return i*2;

    }

    //Необходимо написать 4 метода:
    //сложение 2х чисел
    //вычитание 2х чисел
    //умножение 2х чисел
    //деление 2х чисел

    public static int intAddition(int a, int b){
        return a + b;
    }

    public static int intSubstraction(int a, int b){
        return a - b;
    }

    public static int intMultuplication(int a, int b){
        return a * b;
    }

    public static int intDivision(int a, int b){
        return a / b;
    }


}


/*
import org.junit.*;
import org.junit.rules.*;
import org.junit.runner.Description;

public class JavaTest{
  @Test
  public final void test_all() {
    Assert.assertEquals( "Nope!" , 4, Java.doubleInteger(2)); // Test cases here!
  }
}
 */