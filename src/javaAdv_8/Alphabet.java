package javaAdv_8;

public class Alphabet {

    public static String position(char letter)
    {

        String [] alphabet = "abcdefghijklmnopqrstuvwxyz".split("");
        String pos = "";

        for (int i = 0; i < alphabet.length; i++){
            if (String.valueOf(letter).equals(alphabet[i])){
                 pos = "Position of alphabet: ".concat(String.valueOf(i + 1));
            }
        }

        return pos;
    }

}
