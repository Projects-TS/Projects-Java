package HomeTask;

public class WhileLoopTask {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while (i <= 500) {
            if (i == 100) {
                break;
            }
            if (i % 4 == 0) {
                i++;
                continue;
            }
            if (i % 7 == 0) {
                System.out.println(i);
                sum += i;
            }
            i++;
        }
        System.out.println("The sum is: " + sum);
    }
}


