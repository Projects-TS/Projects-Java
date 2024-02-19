package ClassTask.LogicalOperators;

public class LogicalOperatorsTask {
    public static void main(String[] args) {

         // when ever one of the pair is true then in ( || ) it will be true
         // and in (&&) if there will be one false in the pair then
         // it will be false
         // we always check the () first, or the (&&) before ( || )
        System.out.println((0 > 5 && 6 > 5) || 7 == 7);  //(false) || true  --> true
        System.out.println (0 > 5 && (6 > 5 || 7 == 7)); // false && (true) --> false
        System.out.println(0 > 5 && 6 > 5 || 7 == 7);  // false || true --> true
        System.out .println(0 > 5 || 6 > 5 && 7 == 7) ;  // false || true --> true
        System.out .println(2 < 5 == true && 10 >= 10) ; // true && true --> true
    }
}
