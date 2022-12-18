public class Ternary2 {
    public static void main(String[] args) {
        int x=1, y=2, z=3;
        
        int simpleTernary = y > x ? 69 : 96; 
        System.out.println("Simple Ternary: "+simpleTernary);

        int multiTernary = y > x ? z < x ? 6 : 69 : 96;
        System.out.println("Multi Ternary: "+multiTernary);
    }    
}