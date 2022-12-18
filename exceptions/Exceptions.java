import java.io.IOException;
import java.sql.SQLException;


public class Exceptions{
    public static void main(String[] args) {

        try {
            throw new IOException();
        } catch (IOException e) {
            System.out.println("\n IOException is Thrown:\n" + e);
        }

        
        try {
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println("\n ArithmeticException is Thrown:\n" + e);
        }

        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\n ArrayIndexOutOfBoundsException is Thrown:\n" + e);
        }

        
        try {
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            System.out.println("\nArrayIndexOutOfBoundsException is Thrown:\n" + e);
        }

        try {
            throw new SQLException();
        } catch (SQLException e) {
            System.out.println("\n SQLException is Thrown:\n" + e);
        }


        
        
    }
}