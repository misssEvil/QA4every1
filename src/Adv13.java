import java.util.ArrayList;
import java.util.List;
import Common.Printing;

public class Adv13 {
    public static void main(String[] args) {

        Printing.printHW("13");
        Printing.printTask("1");

        List<String> colorsList = new ArrayList<>();
        colorsList.add("White");
        colorsList.add("Tan");
        colorsList.add("Yellow");
        colorsList.add("Orange");
        colorsList.add("Red");
        colorsList.add("Pink");
        colorsList.add("Purple");
        colorsList.add("Blue");

        System.out.println("initial list:        " + colorsList);

        for (int i=0; i < colorsList.size(); i++){
            if (colorsList.get(i).contains("l")){
                colorsList.remove(i);
                i--;
            }
        }
        System.out.println("list after deleting: " + colorsList);


        Printing.printTask("2-3");

        List <Integer> listOfNums = new ArrayList<>();
        int min = 100;
        int max = 1000;
        for (int i = 0; i < 20; i++){
            int n = (int) Math.floor(Math.random()*(max-min+1)+min);
            listOfNums.add(n);
        }
        System.out.println("initial list:        " + listOfNums);

        for (int i = 0; i < listOfNums.size(); i++){
            if (listOfNums.get(i) % 2 == 0){
                listOfNums.remove(i);
                i--;
            }
        }
        System.out.println("list after deleting: " + listOfNums);

        Printing.printTask("extra task");
        List <Integer> listOfNums2 = new ArrayList<>();
        for (Integer ii = 0; ii < 20; ii++){
            listOfNums2.add((int) Math.floor(Math.random()*(max-min+1)+min));
        }
        System.out.println("initial list:        " + listOfNums2);

        for (Integer ii = 0; ii < listOfNums2.size(); ii++){
            if (listOfNums2.get(ii) % 2 == 0){
                listOfNums2.remove((int)ii);
                ii--;
            }
        }
        System.out.println("list after deleting: " + listOfNums2);
    }
}
