package STRINGS;

public class BasicStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("geeksForGeeks") ;
        StringBuilder sb2 = sb1 ;

        System.out.println(sb1 == sb2) ;
        
        sb1 = sb1.append("null") ;

        System.out.println(sb1 == sb2) ;

        StringBuilder sb3 = new StringBuilder("x") ;
        System.out.println(sb3.length());
        System.out.println(sb3.capacity());
    }
}
