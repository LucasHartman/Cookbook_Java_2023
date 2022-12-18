import java.util.ArrayList;

public class ForEachLambda {
    public static void main(String[] args) {
    var lst = new ArrayList<Integer>();
    lst.add(5);
    lst.add(9);
    lst.add(8);
    lst.add(1);
    
    // long version
    lst.forEach( (Integer n) -> {System.out.println(n);});    

    // medium version
    lst.forEach( (n) -> { System.out.println(n); });
    
    // short version
    lst.forEach( n -> System.out.println(n));          

    
        
    }
}