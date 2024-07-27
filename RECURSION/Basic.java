package RECURSION ;

public class Basic
{
    static void fun()
    {
        System.out.print(1) ;
        fun() ;
    }
    public static void main(String[] args)
    {
        System.out.println("Recrsion start");
        fun() ;
        System.out.println("Recursion end");
    }
}