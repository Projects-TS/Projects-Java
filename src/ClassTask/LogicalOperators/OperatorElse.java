package ClassTask.LogicalOperators;

public class OperatorElse {
    public static void main(String[] args) {

        int age = 17;

        System.out.println(age >= 18);

        if (age >= 18) {
            System.out.println("you are at least 18!");
            System.out.println("you can enter");
            System.out.println("welcome");

        }
        else {
            System.out.println("you're under the age....");
            System.out.println("try next year...");
        }

        System.out.println("after if else block...");
    }
}
