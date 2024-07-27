package ARRAY;

public class SortedArray {
    public static boolean checkSorted(int[] arr){
        for(int i=0 ; i<arr.length-1 ; i++){
            if(arr[i]>arr[i+1])
            return false ;
        }

        return true ;
    }

    public static void main(String[] args) {
        
        int[] arr = {10,20,30,40,50,60} ;
        int[] brr = {1,2,3,6,5} ;

        System.out.println(checkSorted(arr));
        System.out.println(checkSorted(brr));
    }
}
