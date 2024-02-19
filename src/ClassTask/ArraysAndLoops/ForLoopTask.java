package ClassTask.ArraysAndLoops;

public class ForLoopTask {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1000; i >= 0; i--) {
            if (i % 5 == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("The sum of all numbers divisible by 5 from 1000 to 0 is: " + sum);
    }
}

