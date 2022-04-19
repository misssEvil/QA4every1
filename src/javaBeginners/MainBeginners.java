package javaBeginners;

import Common.Printing;

public class MainBeginners {
    public static void main(String[] args) {

        Printing.printHW("5");
        Printing.printTask("2");
        System.out.println(HW5.dayOfWeek(5));

        Printing.printTask("3");
        System.out.println(HW5.largestValue(10,2,58));

        Printing.printTask("4");
        System.out.println(HW5.smallestValue(10, 64, 1));
        System.out.println(HW5.smallestValue2(40, 14, -5));
        System.out.println(Common.Verification.verifyEquals(1, HW5.smallestValue(10, 64, 1)));

        Printing.printTask("5");
        System.out.println(HW5.avgTemp(37.2, 37.4, 37.1, 37.3, 37.5) + " C");
        System.out.println("Purchase amount: " + HW5.findTotal(10.99, 4) + "$");

        Printing.printTask("6");
        System.out.println(HW5.printPrice(472.99f));

        Printing.printTask("7");
        System.out.println(HW5.printQuantity(17.010f));

        Printing.printTask("8");
        System.out.println("Total: " + HW5.findTotal(5.99, 6));

        Printing.printTask("9");
        System.out.println(HW5.printReceipt("apples", 2.15f, 3));

        // -------------------------------------------------------------------------------------

        Printing.printHW("6");
        Printing.printTask("1");
        System.out.println("Print sequence [0, 9]");
        HW6.descSeq();
        System.out.println();

        Printing.printTask("2");
        System.out.println("Print subsequence (10, 0]");
        HW6.ascSeq();
        System.out.println();

        Printing.printTask("3");
        System.out.println("Print seq [50, 55] step width 2");
        HW6.seq3();
        System.out.println();

        Printing.printTask("4");
        System.out.println("Print seq (327, 300) multiple of 7");
        HW6.seq4();
        System.out.println();

        Printing.printTask("5");
        System.out.println("Print seq [12,13] step width 0.1");
        HW6.seq5();
        System.out.println();

        Printing.printTask("6");
        System.out.println("Print seq [215, 237] multiple of 2");
        HW6.seq6();
        System.out.println();

        Printing.printTask("7");
        System.out.println("Print seq (7, 14) multiple of 7");
        HW6.seq7();
        System.out.println();

        Printing.printTask("8");
        System.out.println("Print seq [-32,768, 32,768] multiple of 15001");
        HW6.seq8();
        System.out.println();

        Printing.printTask("9");
        System.out.println("Print seq [-10, 34] multiple of 11 print blue, multiple of 12 print red, 0 is ZERO");
        HW6.seq9();
        System.out.println();

        Printing.printTask("10");
        System.out.println("Print user seq with input params start, end, step");
        System.out.println(HW6.userSeq(16, 75, 4));
        System.out.println();

        // ----------------------------------------------------------------------------------------------

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
            if (catsNames[i].equals("Ryzhik") && isCatRed[i]) {
                System.out.println("Feed the cat!");
            }
        }

        Printing.printTask("12");
        System.out.println("Average age of cats is " + HW7.findAvgValue(catsAges));

        Printing.printTask("13");
        System.out.println("The youngest cat is " + HW7.findMinValue(catsAges) + " y.o.");

        Printing.printTask("14");
        System.out.println("The oldest cat is " + HW7.findMaxValue(catsAges) + " y.o.");

        Printing.printTask("15");
        System.out.println("Amount of grey cats in an array is " + HW7.amountOfCatsByColor(catColors, "grey"));

        Printing.printTask("16");
        for (int i = 0; i < catsNames.length; i++) {
            if ((i % 2 == 0) && (catsAges[i] <= 3)) {
                System.out.println(catsNames[i] + " ");
            }
        }

        Printing.printTask("17");
        System.out.println("Filling an array with random numbers ");
        int[] array = new int[10];
        HW7.fillArrayWithRandoms(array, 20);
        Printing.printingArr(array);

        System.out.println("Filling an array with even random numbers ");
        int[] array2 = new int[10];
        HW7.fillArrayWithEvenRandoms(array2, 20);
        Printing.printingArr(array2);

        System.out.println("Filling an array with odd random numbers ");
        int[] array3 = new int[10];
        HW7.fillArrayWithOddRandoms(array3, 20);
        Printing.printingArr(array3);

        Printing.printTask("19");
        int [] array4 = new int[10];
        HW7.fillArrayRandomWideRange(array4,1000,900);
        Printing.printingArr(array4);

        Printing.printHW("8");


    }
}
