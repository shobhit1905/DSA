package ARRAY;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static boolean twoSum1(int[] arr , int target){
        for(int i=0 ; i<arr.length-1 ; i++){
            for(int j=i+1 ; j<arr.length ; j++){
                if(arr[i]+arr[j] == target)
                    return true ;
            }
        }

        return false ;
    }

    public static boolean twoSum2(int arr[] , int target){
        HashMap<Integer,Integer> map = new HashMap<>() ;

        for(int i=0 ; i<arr.length ; i++){
            int rem = target - arr[i] ;

            if(map.containsKey(rem))
            return true ;
            else
            {
                map.put(arr[i],i) ;
            }
        }

        return false ;
    }

    public static boolean twoSum3(int[] arr , int target){

        Arrays.sort(arr) ;
        int i=0 , j=arr.length-1 ;

        while(i<j){
            int sum = arr[i]+arr[j] ;

            if(sum == target)
            return true ;
            else if(sum > target)
            j-- ;
            else
            i++ ;
        }

        return false ;
    }

    public static void main(String[] args) {
        
        int[] arr = {2,4,7,3,9} ;

        System.out.println(twoSum1(arr, 6));
        System.out.println(twoSum2(arr, 10));
        System.out.println(twoSum3(arr, 15));
    }
}
