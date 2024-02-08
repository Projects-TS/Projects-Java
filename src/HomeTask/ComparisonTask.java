package HomeTask;

public class ComparisonTask {
    public static void main(String[] args) {

        int number1 = 6;
        int number2 = 10;
        boolean result = number2 > number1;
        System.out.println(result);
        int number3 = 5;
        int number4 = 5;
        boolean result1 = number4 >= number3;
        System.out.println(result1);
        int number5 = 10;
        int number6 = 20;
        boolean result2 = number6 < number5;
        System.out.println(result2);
        int number7 = 35;
        int number8 = 50;
        boolean result3 = number8 >= number7;
        System.out.println(result3);
        int number9 = 25;
        int number10 = 25;
        boolean result4 = number10 == number9;
        System.out.println(result4);
        int number11 = 50;
        int number12 = 50;
        boolean result5 = number12 != number11;
        System.out.println(result5);
        String City1 = "City";
        String City2 = "-City";
        boolean result6 = City2 == City1;
        System.out.println(result6);
        String city3 = "City";
        String city4 = "citY";
        boolean result7 = city3.equalsIgnoreCase(city4);
        System.out.println(result7);

    }
}
