package HW5;
import java.awt.font.NumericShaper;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//https://www.codewars.com/kata/5b077ebdaf15be5c7f000077/train/java
//Task:
//Given a non-negative integer, 3 for example, return a string with a murmur:
// "1 sheep...2 sheep...3 sheep...". Input will always be valid, i.e. no negative integers.

public class countingSheep {

    public static String countingSheep(int num){
        String s = "";

            for (int i = 1; i < num + 1; i++){
                s = s + i + " sheep...";
            }

        return s;
    }

    public static String countingSheep2(int num){
        String s = "";
        int i = 0;
        while (i < num){
            s += (i+1) + " sheep...";
            i ++;
        }
        return s;
    }

    public static String countingSheep3(int num){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= num; i++){
            stringBuilder.append(i).append(" sheep...");
        }
        return stringBuilder.toString();
    }

    public static String countingSheep4(int num){
        return IntStream.rangeClosed(1, num)
                .mapToObj(i -> i + " sheep...")
                .collect(Collectors.joining());
    }
}


/*
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {
    @Test
    public void testSomething() {
        assertEquals("", Kata.countingSheep(0));
        assertEquals("1 sheep...", Kata.countingSheep(1));
        assertEquals("1 sheep...2 sheep...", Kata.countingSheep(2));
        assertEquals("1 sheep...2 sheep...3 sheep...", Kata.countingSheep(3));
    }
}
 */