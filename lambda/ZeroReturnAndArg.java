//import java.util.function.Runnable;

public class ZeroReturnAndArg {
    public static void main(String[] args) {

        // Declare
        Runnable runnable = () -> { System.out.println("Lambda Runnable running"); };

        // Instance
        runnable.run();

    }
}

/*
# RUNNABLE
argument:                zero
return:                  zero
 */