package BASIC_MATH;

import java.util.ArrayList;
import java.util.Collections;

public class Divisors {
    public static void divisors(int number){
        for(int i=1 ; i<= number ; i++){
            if(number%i == 0)
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static ArrayList<Integer> divisor(int number){
        ArrayList<Integer> res = new ArrayList<>() ;

        for(int i=1 ; i<=Math.sqrt(number) ; i++){
            if(number%i == 0){
                res.add(i) ;
                if(number/i != i)
                res.add(number/i) ;
            }
        }
        Collections.sort(res);
        return res ;
    }

    public static void main(String[] args) {
        divisors(100) ;
        divisors(55) ;

        ArrayList<Integer> list1 = divisor(100) ;
        ArrayList<Integer> list2 = divisor(55) ;

        System.out.println(list1);
        System.out.println(list2);
    }
}
