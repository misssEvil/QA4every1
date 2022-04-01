package javaBeginners;

public class Verification {

    public static String verifyEquals(int expectedResult, int actualResult){
        if (expectedResult == actualResult){
            return "\u001B[32mPassed\u001B[0m";
        }
        else
            return "\u001B[31mFailed\u001B[0m";
    }


}
