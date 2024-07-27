package BASIC_MATH ;

public class GCD {
    public static int gcd1(int a , int b){
        int res = 1 ;
        for(int i=2 ; i<=Math.min(a,b) ; i++){
            if(a%i==0 && b%i==0)
            res = i ;
        }

        return res ;
    }

    public static int gcd2(int a , int b){
        while(a!=b){
            if(a > b)
            a=a-b ;
            else
            b=b-a ;
        }

        return a ;
    }

    public static int gcd3(int a , int b){
        if(b==0)
        return a ;

        return gcd3(b,a%b) ;
    }

    public static void main(String[] args) {
        System.out.println(gcd1(10,9));
        System.out.println(gcd1(102,21));
        System.out.println(gcd2(10,9));
        System.out.println(gcd2(102,21));
        System.out.println(gcd3(10,9));
        System.out.println(gcd3(102,21));

    }
}
