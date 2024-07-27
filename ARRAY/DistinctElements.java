package ARRAY;

import java.util.ArrayList;
import java.util.TreeSet;

public class DistinctElements {
    public static ArrayList<Integer> distinctElements(int[] a , int[] b){
        TreeSet<Integer> set = new TreeSet<>() ;
        for(int i=0 ; i<a.length ; i++)
        set.add(a[i]) ;
        for(int i=0 ; i<b.length ; i++)
        set.add(b[i]) ;

        ArrayList<Integer> ans = new ArrayList<>(set) ;
        return ans ;
    }

    public static void main(String[] args) {
        
        int[] a = {2,2,3,4,5} ;
        int[] b = {1,1,2,3,4} ;

        ArrayList<Integer> list = distinctElements(a, b) ;

        for(Integer x : list)
        System.out.print(x + " ");
    }
}
