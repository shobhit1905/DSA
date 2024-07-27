package BASIC_MATH;

public class Prime {
    public static boolean isPrime1(int number){
        if(number==1)
        return false ;

        for(int i=2 ; i<number ; i++){
            if(number%i == 0)
            return false ;
        }

        return true ;
    }

    public static boolean isPrime2(int number){
        if(number==1)
        return false ;
        for(int i=2 ;i<=Math.sqrt(number) ; i++){
            if(number%i == 0)
            return false ;
        }

        return true ;
    }

    public static boolean isPrime3(int number){
        if(number == 1)
        return false ;

        if(number == 2 || number == 3)
        return true ;

        if(number%2 == 0 || number%3==0)
        return false ;

        for(int i=5 ; i<=Math.sqrt(number) ; i+=6)
        {
            if(number%i==0 || number%(i+2)==0)
            return false ;
        }

        return true ;
    }

    public static void main(String[] args) {
        
        System.out.println(isPrime1(1));
        System.out.println(isPrime1(3));
        System.out.println(isPrime1(10));
        System.out.println(isPrime2(19));
        System.out.println(isPrime2(11));
        System.out.println(isPrime2(190));
        System.out.println(isPrime3(109));
        System.out.println(isPrime3(101));
    }
}
