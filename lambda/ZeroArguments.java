import java.util.function.Supplier;
import java.util.Random;



public class ZeroArguments {
    public static void main(String[] args) {

        // Declare
        Supplier<Integer> supplierLambda = () ->  new Random().nextInt();

        // Instance
        Integer res = supplierLambda.get();
        System.out.println("Supplier: " +res);


    }
}

/*
# SUPPLIER
argument:                zero
return:                  any type
 */