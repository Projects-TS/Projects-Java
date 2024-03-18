package FinalExercises;
//this exercise is for printing the words in reverse.
public class Exercise_3 {
    public static void main(String[] args) {
        String petStore = "Black Snake";
        String reversedPetStore = reverse(petStore); // why you need this?
        System.out.println("Tha pet you want to buy is a " + reversedPetStore);}
        public static String reverse(String pet){
        // this one is using a non built-in reversing method
        String reversed = "";
        for (int i = pet.length() - 1; i >= 0; i--){
            reversed += pet.charAt(i); // great job!
        }
        return reversed; // there is no need for a return

        // this one is using built-in reversing method
//            return new
//        StringBuilder(pet).reverse().toString();
        }
    }

