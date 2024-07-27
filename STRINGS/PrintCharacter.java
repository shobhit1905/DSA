package STRINGS;

public class PrintCharacter {

    public static void printCharacters(char c1 , char c2){
        int a = c1 ;
        int b = c2 ;

        for(int i=a ; i<=b ; i++){
            char ch = (char)i ;
            System.out.print(ch + " ");
        }
    }
    public static void main(String[] args) {
        char c1 = 'a' ;
        char c2 = 'g' ;

        printCharacters(c1,c2) ;
    }
}
