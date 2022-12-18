import java.util.ArrayList;

public class Loops {
    public static void main(String[] args) {
        int i = 0;

        // FOR LOOP
        for (int j = 0; j < 5; j++) {
            System.out.println(j);
            }



        // WHILE LOOP
        while (i < 5) {
        System.out.println(i);
        i++;
        }



        // DO WHILE LOOP
        do {
        System.out.println(i);
        i++;
        }
        while (i < 5);


        // FOR EACH LOOP
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String y : cars) {
            System.out.println(y);
        }




        // FOR EACH LAMBDA LOOP
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