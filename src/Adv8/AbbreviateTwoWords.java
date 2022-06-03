package Adv8;

public class AbbreviateTwoWords {
    public static String abbrevName(String name) {

        return name.substring(0,1).toUpperCase() + "." +
                name.substring(name.indexOf(" ") + 1 , name.indexOf(" ") + 2).toUpperCase();
    }
}

/*
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {

    @Test
    public void testFixed() {
        assertEquals("S.H", AbbreviateTwoWords.abbrevName("Sam Harris"));
        assertEquals("P.F", AbbreviateTwoWords.abbrevName("Patrick Feenan"));
        assertEquals("E.C", AbbreviateTwoWords.abbrevName("Evan Cole"));
        assertEquals("P.F", AbbreviateTwoWords.abbrevName("P Favuzzi"));
        assertEquals("D.M", AbbreviateTwoWords.abbrevName("David Mendieta"));
    }
   }
 */