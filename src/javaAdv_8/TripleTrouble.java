package javaAdv_8;

public class TripleTrouble {

    public static String tripleTrouble(String one, String two, String three){
        String str = "";
        String [] one1 = one.split("");
        String [] two2 = two.split("");
        String [] three3 = three.split("");

        for (int i =0; i < one1.length; i++){
            str = str + one1[i] + two2[i] + three3[i];

        }
        return str;
    }
}
