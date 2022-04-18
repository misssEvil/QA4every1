package javaAdv_8;

public class AnimalFeast {

   public static boolean animalFeast(String beast, String dish){
        String [] animal = beast.split("");
       // String fisrtLetter = animal[0];
       // String lastLetter = animal[(animal.length)-1];

        String [] food = dish.split("");

       return animal[0].equals(food[0]) &&
               animal[(animal.length) - 1].equals(food[(food.length) - 1]);
    }



}
