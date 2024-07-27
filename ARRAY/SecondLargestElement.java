package ARRAY;

import java.util.Arrays;

public class SecondLargestElement {
    //Brute-Force
    public static int seconddLargest(int[] arr){
        Arrays.sort(arr) ;

        for(int i=arr.length-1 ; i>=0 ; i--){
            if(arr[i]!=arr[arr.length-1]){
                return arr[i] ;
            }
        }
        return -1 ;

        //TC = O(nlogn)
    }

    //Better
    public static int secondLargest(int[] arr){
        int lar = LargestElement.largest(arr) ;

        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] == lar)
            arr[i] = -1 ;
        }

        return LargestElement.largest(arr) ;
    }

    //Optimal
    public static int secLargest(int[] arr){
        if(arr.length == 0)
        return Integer.MIN_VALUE ;
        
        int largest = arr[0] ;
        int s_largest = Integer.MIN_VALUE ;

        for(int i=1 ; i<arr.length ; i++){
            if(arr[i]>largest){
                s_largest = largest ;
                largest = arr[i] ;
            }
            else if(arr[i]<largest){
                if(arr[i]>s_largest)
                s_largest=arr[i] ;
            }
        }

        return s_largest ;
    }

    public static void main(String[] args) {
        int[] a = {12,3,2,6,5,87,467,354,22} ;
        int[] b = {6,6,6,6,6} ;
        int[] c = {} ;
        // System.out.println(seconddLargest(a));
        // System.out.println(seconddLargest(b));
        // System.out.println(seconddLargest(c));
        System.out.println(secLargest(a));
        System.out.println(secLargest(b));
        System.out.println(secLargest(c));
    }
}
