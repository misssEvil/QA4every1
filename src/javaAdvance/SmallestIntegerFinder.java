
//https://www.codewars.com/kata/55a2d7ebe362935a210000b2/train/java
//Given an array of integers your solution should find the smallest integer.
//For example:
//Given [34, 15, 88, 2] your solution will return 2
//Given [34, -345, -1, 100] your solution will return -345
//You can assume, for the purpose of this kata, that the supplied array will not be empty.

package javaAdvance;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SmallestIntegerFinder {
    public static void main(String[] args) throws  IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter array's length");
        Integer arrayLength = Integer.parseInt(reader.readLine());
        int [] array = new int[arrayLength];
        System.out.println("enter array elements each on new row");

        for (int i = 0; i < arrayLength - 1; i++){
            array[i] = Integer.parseInt(reader.readLine());
        }

        System.out.print("our arrays is ");
        for (int i = 0; i < array.length; i++ ){
            System.out.print(array[i] +" ");
        }
        System.out.println();

        System.out.println("min value in array is " + getMinValue(array) );







    }

    // sort array


    public static int getMinValue(int [] array){
        int minValue = array[0];
        for (int i = 0; i <= array.length -1; i++ ){
            if (array[i] < minValue){
                minValue = array[i];

            }
        }
        return minValue;

    }
}

/*
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SmallestIntegerFinderTest {

    @Test
    public void example1(){
        int expected = 11;
        int actual = SmallestIntegerFinder.findSmallestInt(new int[]{78,56,232,12,11,43});
        assertEquals(expected, actual);
    }


    @Test
    public void example2(){
        int expected = -33;
        int actual = SmallestIntegerFinder.findSmallestInt(new int[]{78,56,-2,12,8,-33});
        assertEquals(expected, actual);
    }

    @Test
    public void example3(){
        int expected = Integer.MIN_VALUE;
        int actual = SmallestIntegerFinder.findSmallestInt(new int[]{0,Integer.MIN_VALUE,Integer.MAX_VALUE});
        assertEquals(expected, actual);
    }
}
 */
