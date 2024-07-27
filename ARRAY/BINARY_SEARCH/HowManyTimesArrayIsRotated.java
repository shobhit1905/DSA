package ARRAY.BINARY_SEARCH;

public class HowManyTimesArrayIsRotated {
    public static int numberRotated(int[] arr){
        int ans = 0 ;
        int min = Integer.MAX_VALUE ;

        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] < min){
                min = arr[i] ;
                ans = i ;
            }
        }

        return ans ;
    }

    public static int numberOfTimesArrayRotated(int[] arr){
        int ans = 0 , min = Integer.MAX_VALUE ;
        int low=0 , high = arr.length-1 ;
        while(low <= high){
            int mid = low + (high-low)/2 ;

            if(arr[low] <= arr[mid]){
                if(arr[low] < min){
                    min = arr[low] ;
                    ans = low ;
                }
                low = mid +1 ;
            }
            else{
                if(arr[mid] < min){
                    min = arr[mid] ;
                    ans = mid ;
                }
                high = low -1 ;
            }
        }

        return ans ;
    }

    public static void main(String[] args) {
        
        int[] arr ={3,4,5,1,2} ;
        int[] brr = {20,30,40,50,60,10} ;
        int[] crr = {12,13,14,20} ;

        System.out.println(numberOfTimesArrayRotated(arr));
        System.out.println(numberOfTimesArrayRotated(brr));
        System.out.println(numberOfTimesArrayRotated(crr));
    }
}
