package RECURSION;

public class Basic1 {

    static int count = 0 ;
    static void fun()
    {
        if(count == 100)
        return ;

        System.out.println(count) ;
        count++ ;
        fun() ;
    }
    public static void main(String[] args)
    {
        fun() ;
    }
}
