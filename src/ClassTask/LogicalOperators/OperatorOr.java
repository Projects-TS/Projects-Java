package ClassTask.LogicalOperators;

public class OperatorOr {
    public static void main(String[] args) {
                           // true || true
        System.out.println(5 > 4 || 6 > 5);

                           // false || true
        System.out.println(5 < 4 || 6 > 5);

                           // false || false
        System.out.println(5 < 4 || 6 < 5);

                           // true || false
        System.out.println(5 > 4 || 6 < 5);

        // it will always check true or false in pairs
        // that why in this situation its true
                          //      true       || false
                           // true || false || false
        System.out.println(5 > 4 || 6 < 5 || 10 > 50);




    }
}
