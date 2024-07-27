package RECURSION;

public class Questions {
    
    static void sum(int i , int sum)
    {
        if(i == 0)
        {
            System.out.println(sum);
            return ;
        }

        sum(i-1 , sum + i) ;
    }

    static int sum(int n)
    {
        if(n == 0)
        return 0 ;

        return n + sum(n-1) ;
    }

    static long factorial(int n)
    {
        if(n == 0)
        return 1 ;

        return n * factorial(n-1) ;
    }

    public static void main(String[] args) {
        //sum(10,0) ;
        //System.out.println(sum(5));
        System.out.println(factorial(5));
    }
}
