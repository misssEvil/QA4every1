package HW5;
//https://www.codewars.com/kata/53ee5429ba190077850011d4/train/java
//You need to double the integer and return it

public class Java {
    public static void main(String[] args) {
        System.out.println(doubleInteger(11));
    }




    public static int doubleInteger(int i) {
        return i*2;

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