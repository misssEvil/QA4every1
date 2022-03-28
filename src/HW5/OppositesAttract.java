package HW5;
//https://www.codewars.com/kata/555086d53eac039a2a000083/train/java
//Timmy & Sarah think they are in love, but around where they live,they will only know once they
// pick a flower each. If one of the flowers has an even number of petals and the other has
// an odd number of petals it means they are in love.Write a function that will take the number
// of petals of each flower and return true if they are in love and false if they aren't.


public class OppositesAttract {
    public static void main(String[]args){
        System.out.println(isLove(6, 12));

    }

    public static boolean isLove(final int flower1, final int flower2) {
        //if ((flower1 % 2 == 0 && flower2 % 2 == 1) || ( flower1 % 2 == 1 && flower2 % 2 == 0)){
            //System.out.println(true);
            return ((flower1 % 2 == 0 && flower2 % 2 == 1) || ( flower1 % 2 == 1 && flower2 % 2 == 0));


       // }
        //return false;
    }
}

/*
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OppositesAttractTest {

  @Test
  public void testOddAndEven() {
    assertEquals(true, OppositesAttract.isLove(1, 4));
  }

  @Test
  public void testEvenAndEven() {
    assertEquals(false, OppositesAttract.isLove(2, 2));
  }

  @Test
  public void testOddAndOdd() {
    assertEquals(false, OppositesAttract.isLove(1, 1));
  }

  @Test
  public void testEvenAndOdd() {
    assertEquals(true, OppositesAttract.isLove(0, 1));
  }

}
 */