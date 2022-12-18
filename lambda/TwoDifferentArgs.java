import java.util.function.Function;
import java.util.function.BiFunction;

public class TwoDifferentArgs {
    public static void main(String[] args) {

        // Declare
        Function<String, Integer> functionLambda = x -> x.length();
        
        // Instance
        int res = functionLambda.apply("Mars");   
        System.out.println("Function: " +res); // 4



        
        // Bi Declare
        BiFunction<Integer, Integer, Integer> biLambda = (x1, x2) -> x1 + x2;

        // Bi Instance
        Integer res2 = biLambda.apply(2, 3);
        System.out.println(res2); // 5



        
        
    }
}

/*
# Function
argument:                2 of any type
return:                  same as argument
 */