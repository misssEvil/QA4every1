package javaBeginners;

import Common.Printing;
import java.util.Random;

public class HW7 {
    public static void main(String[] args) {

        Printing.printHW("7");
        Printing.printTask("1");

        String[] catsNames = new String[]{"Murzik", "Cherhysh", "Murka", "Vas'ka", "Ryzhik", "Dymka", "Patrick", "Zorro"};

        catsNames[4] = "Ryzhik";
        catsNames[1] = "Cherhysh";

        System.out.println("Printing array catNames:");
        Printing.printingArr(catsNames);

        Printing.printTask("3");
        String[] catColors = new String[]{"grey", "black", "grey", "brown", "red", "grey", "red", "grey"};
        System.out.println("Printing array catColors");
        Printing.printingArr(catColors);

        Printing.printTask("4");
        int[] catsAges = new int[]{4, 11, 2, 1, 3, 8, 9, 15};
        System.out.println("Printing array catAges");
        Printing.printingArr(catsAges);

        Printing.printTask("5");
        boolean[] isCatRed = new boolean[8];
        for (int i = 0; i < catColors.length; i++) {
            if (catColors[i].equals("red")) {
                isCatRed[i] = true;
            } else isCatRed[i] = false;
        }

        System.out.println("Printing array isCatRed:");
        Printing.printingArr(isCatRed);

        Printing.printTask("6");
        System.out.println("Cat from box 6 is " + catsNames[5]);

        System.out.print("Cats with even box indexes: ");
        for (int i = 0; i < catsNames.length; i++) {
            if (i % 2 == 0) {
                System.out.print(catsNames[i] + " ");
            }
        }

        System.out.println();
        System.out.print("Cats with box indexes multiply by 4: ");
        for (int i = 0; i < catsNames.length; i++) {
            if (i % 4 == 0) {
                System.out.print(catsNames[i] + " ");
            }
        }

        System.out.println();
        System.out.print("Color of cats with odd box indexes: ");
        for (int i = 0; i < catColors.length; i++) {
            if (i % 2 == 1) {
                System.out.print(catColors[i] + " ");
            }
        }

        System.out.println();
        System.out.print("Color of cats with box indexes multiply by 3: ");
        for (int i = 0; i < catColors.length; i++) {
            if (i % 3 == 0) {
                System.out.print(catColors[i] + " ");
            }
        }

        System.out.println();
        Printing.printTask("7");
        System.out.print("Feed cats: ");
        for (int i = 0; i < catColors.length; i++) {
            if (catColors[i].equals("grey")) {
                System.out.print(catsNames[i] + " ");
            }
        }

        System.out.println();
        Printing.printTask("8");
        System.out.print("Cats needed a vaccine: ");
        for (int i = 0; i < catsAges.length; i++) {
            if (catsAges[i] <= 2) {
                System.out.print(catsNames[i] + " ");
            }
        }

        System.out.println();
        Printing.printTask("9");
        System.out.print("Cat in last box is " + catsNames[7] + ", " + catColors[7] + ", " + catsAges[7]);

        System.out.println();
        Printing.printTask("11");
        for (int i = 0; i < catsNames.length; i++) {
            if (catsNames[i].equals("Ryzhik") && isCatRed[i] == true) {
                System.out.println("Feed the cat!");
            }
        }

        Printing.printTask("12");
        System.out.println("Average age of cats is " + findAvgValue(catsAges));

        Printing.printTask("13");
        System.out.println("The youngest cat is " + findMinValue(catsAges) + " y.o.");

        Printing.printTask("14");
        System.out.println("The oldest cat is " + findMaxValue(catsAges) + " y.o.");

        Printing.printTask("15");
        System.out.println("Amount of grey cats in an array is " + amountOfCatsByColor(catColors, "grey"));

        Printing.printTask("16");
        for (int i = 0; i < catsNames.length; i++) {
            if ((i % 2 == 0) && (catsAges[i] <= 3)) {
                System.out.println(catsNames[i] + " ");
            }
        }

        Printing.printTask("17");
        System.out.println("Filling an array with random numbers ");
        int[] array = new int[10];
        fillArrayWithRandoms(array, 20);
        Printing.printingArr(array);

        System.out.println("Filling an array with even random numbers ");
        int[] array2 = new int[10];
        fillArrayWithEvenRandoms(array2, 20);
        Printing.printingArr(array2);

        System.out.println("Filling an array with odd random numbers ");
        int[] array3 = new int[10];
        fillArrayWithOddRandoms(array3, 20);
        Printing.printingArr(array3);

        Printing.printTask("19");
        int [] array4 = new int[10];
        fillArrayRandomWideRange(array4,1000,900);
        Printing.printingArr(array4);



    }

    public static int findAvgValue(int[] arr) {
        int avg = 0;
        for (int i = 0; i < arr.length; i++) {
            avg = avg + arr[i];
        }
        return avg / arr.length;
    }

    public static int findMinValue(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMaxValue(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int amountOfCatsByColor(String[] arr, String str) {
        int amnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(str)) {
                amnt += 1;
            }

        }
        return amnt;
    }

    public static void fillArrayWithRandoms(int[] arr, int upperBound) {
        Random rndm = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rndm.nextInt(upperBound);
        }

    }

    public static void fillArrayWithEvenRandoms(int[] arr, int upperBound) {
        Random rndm = new Random();

        for (int i = 0; i < arr.length; i++) {
            int element = rndm.nextInt(upperBound);
            if (element % 2 == 0) {
                arr[i] = element;
            }
            else i = i - 1;
        }
    }

    public static void fillArrayWithOddRandoms(int[] arr, int upperBound) {
        Random rndm = new Random();

        for (int i = 0; i < arr.length; i++) {
            int element = rndm.nextInt(upperBound);
            if (element % 2 == 1) {
                arr[i] = element;
            }
            else i = i - 1;

        }
    }

    public static void fillArrayRandomWideRange(int [] arr, int min, int max){

        for (int i = 0; i < arr.length; i++){
            int element = (int) Math.floor(Math.random()*(max-min+1)+min);
            if (element % 2 == 1) {
                arr[i] = -element;
            }
            else i = i - 1;
        }
    }
}
