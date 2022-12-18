import java.util.function.BinaryOperator;

public class TwoArguments {
    public static void main(String[] args) {

        // Declare
        BinaryOperator<Integer> BinaryLambda = (x, y) -> x + y;

        // Instance
        Integer res = BinaryLambda.apply(2, 3);
        System.out.println("BinaryOperator: " +res); // 5
        
    }
}

/*
# PREDICATE
argument:                2 of any type
return:                  same as argument
 */