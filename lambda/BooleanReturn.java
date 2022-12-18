import java.util.function.Predicate;

public class BooleanReturn {
    public static void main(String[] args) {

        // Declare
        Predicate<String> predicateLambda = (s)->s.startsWith("G");

        // Instance
        boolean res = predicateLambda.test("Great");
        System.out.println( "Predicate: " +res); // true
        
    }
}

/*
# PREDICATE
argument:                1 of any type
return:                  boolean
 */