package RECURSION;

public class Factorial {
    public static long fib(int n) {
        if(n == 0 || n == 1)
        return n ;

        return fib(n-1)+fib(n-2) ;
    }

    public static long fibonacci(int n){
        if(n == 0 || n == 1)
        return n ;

        long[] arr = new long[n+1] ;
        arr[0] = 0 ;
        arr[1] = 1 ;

        for(int i = 2 ; i <= n ; i ++){
            arr[i] = arr[i-1] + arr[i-2] ;
        }

        return arr[n] ;
    }

    public static void main(String[] args) {
        
        System.out.println(fib(5));
        System.out.println(fib(10));
        System.out.println(fibonacci(100));
        System.out.println(fibonacci(99));
    }
}
