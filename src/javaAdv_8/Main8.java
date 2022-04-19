package javaAdv_8;

import Common.Printing;

public class Main8 {
    public static void main(String[] args) {

        Printing.printHW("7.1");
        Printing.printTask("1");
        System.out.println(AbbreviateTwoWords.abbrevName("Martin Iden"));
        System.out.println(AbbreviateTwoWords.abbrevName("Harry Edward Styles"));
        System.out.println(AbbreviateTwoWords.abbrevName("jeff azoff"));

        Printing.printTask("2");
        String beast1 = "great blue heron";
        String dish1 = "garlic naan";

        String beast2 = "chickadee";
        String dish2 = "chocolate cake";

        String beast3 = "brown bear";
        String dish3 = "bear claw";

        System.out.println(AnimalFeast.animalFeast(beast1, dish1));
        System.out.println(AnimalFeast.animalFeast(beast2, dish2));
        System.out.println(AnimalFeast.animalFeast(beast3, dish3));

        Printing.printTask("3");
        System.out.println(TripleTrouble.tripleTrouble("aa","bb","cc"));
        System.out.println(TripleTrouble.tripleTrouble("sss", "eee", "aaa"));
        System.out.println(TripleTrouble.tripleTrouble("Bm", "aa", "tn"));

        Printing.printTask("4");
        System.out.println(Alphabet.position('h'));
        System.out.println(Alphabet.position('e'));
        System.out.println(Alphabet.position('s'));

        Printing.printTask("5");
        System.out.println(ArrayUtils.arrayPlusArray(new int[]{1,2,3}, new int[]{4,5,6}));
        System.out.println(ArrayUtils.arrayPlusArray(new int[]{-1,-2,-3}, new int[]{-4,-5,-6}));
        System.out.println(ArrayUtils.arrayPlusArray(new int[]{0,0,0}, new int[]{4,5,6}));
        System.out.println(ArrayUtils.arrayPlusArray(new int[]{100,200,300}, new int[]{400,500,600}));

        Printing.printHW("8.2");

        Printing.printTask("1");
        System.out.println(boolToWord(true));
        System.out.println(boolToWord(false));

        Printing.printTask("2");
        System.out.println(BasicOperations.basicMath("+", 5, 5));
        System.out.println(BasicOperations.basicMath("/", 44, 11));

        Printing.printTask("3");
        Printing.printingArr(ArrayUtils.reverseArr(5));

        Printing.printTask("4");
        Printing.printingArr(ArrayUtils.stringToArray("Robin Good"));
        Printing.printingArr(ArrayUtils.stringToArray("I love arrays they are my favorite"));

        Printing.printTask("5");
        System.out.println("Correct errors in digitizes text: ");
        System.out.println(correct("5TEPHEN HAWK1NG - THE UN1VER5E 1N A NUT5HELL"));
        System.out.println(correct("ERNE5T HEM1NGWAY - F0R WH0M THE BELL T0LL5"));

    }
    public static String boolToWord(boolean b)
    {
        if (b){
            return "Yes";
        }
        else return "No";

    }

    public static String correct(String str) {

        return str.replace('5', 'S').
                    replace('0', 'O').
                    replace('1', 'I');

        }



}
