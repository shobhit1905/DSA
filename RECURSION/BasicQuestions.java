package RECURSION;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BasicQuestions {
    static void printName(int n)
    {
        if(n <= 0)
        return ;

        System.out.println("Shobhit");
        printName(n-1) ;
    }

    static void oneToN(int n)
    {
        if(n == 0)
        return ;

        oneToN(n - 1) ;
        System.out.println(n);
    }

    static void nToOne(int n)
    {
        if(n == 0)
        return ;

        System.out.println(n);
        nToOne(n-1) ;
    }

    static void func(int i , int n)
    {
        if(i > n)
        return ;

        func(i+1 , n) ;
        System.out.println(i);
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
        int n = Integer.parseInt(br.readLine()) ;
        //printName(n) ;
        //oneToN(n) ;
        //nToOne(n) ;
        func(1,n) ;
    }
}
