package FinalExercises;
//this exercise - specifies the desired range (startnumber & endnumber), and printing only values that divided by both of the values.
public class Exercise_5 {
    public static void main(String[] args) {
        int startnumber = 5;
        int endnumber = 45;
        int firstDivideNumber = 2;
        int secondDivideNumber = 12;

        for (int i = startnumber; i <= endnumber; i++){
            if (i% firstDivideNumber == 0 && i % secondDivideNumber == 0) {
                System.out.println(i);
            }
        }
        }
    }

