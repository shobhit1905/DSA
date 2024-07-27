package ARRAY;

import java.util.Arrays;
public class LargestElement {
    
    //Brute Force
    public static int largestElement(int[] arr){

        Arrays.sort(arr) ;
        return arr[arr.length-1] ;

        //TC = O(nlogn)
    }

    //Optimal
    public static int largest(int[] arr){
        if(arr.length == 0)
        return -1 ;
        int res = arr[0] ;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] > res)
            res = arr[i] ;
        }

        return res ;

        //TC = O(n)
    }

    public static void main(String[] args) {
        
        int[] arr = {12,45,23,7,45,76,8,9,3,0,2} ;
        System.out.println(largest(arr));
    }

}
