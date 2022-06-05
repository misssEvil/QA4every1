package javaBeginners;

import Common.Printing;

public class HW6 {

    public static void descSeq(){
        for ( int i = 0; i <= 9; i++){
            System.out.print(i);
        }
    }

    public static void ascSeq() {
        for (int i = 9; i > 0; i--) {
            System.out.print(i);
        }
    }

    public static void seq3(){
        int n = 2;
        for (int i = 50; i<= 55; i+=n){
            System.out.print(i + " ");
        }
    }

    public static void seq4(){
        for (int i = 326; i > 300; i--) // (327, 300)
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }

    }

    public static void seq5(){
        double n = 0.1;
        for ( double i = 13; i >= 12; i -= n ){
            System.out.print(String.format("%,.1f", i) + " ");
        }
    }

    public static void seq6(){
        for (int i = 215; i <= 237; i++){
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }

    public static void seq7(){
        for (int i = 8; i <= 14; i++)
            if(i % 7 ==0){ // always false
                System.out.print(i +" ");
            }

    }

    public static void seq8(){
        for (int i = Short.MIN_VALUE; i < Short.MAX_VALUE; i++ ){
            if ( i % 15001 == 0){
                System.out.print(i + " ");
            }
        }
    }

    public static void seq9(){
        for (int i = -10; i <= 34; i++){
            if (i == 0){
                System.out.print(" zero ");
            }
            else{
                if (i % 12 == 0){
                    System.out.print("\u001B[31m" + i +" \u001B[0m");
                }
                    if (i % 11 == 0) {
                        System.out.print("\u001B[34m" + i + " \u001B[0m");
                    }
                else System.out.print(i + " ");
            }
        }
    }

    public static String userSeq(int start, int end, int step){ // task 10
        String s = "";
        for (int i = start; i <= end; i +=step){
            s += i + " ";
        }
        return s;
    }

}


