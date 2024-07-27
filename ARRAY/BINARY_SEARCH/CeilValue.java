package ARRAY.BINARY_SEARCH;

public class CeilValue {
    public static int getCeil(int[] arr , int x){
        // the smallest value in the array which is >= x
        // same as lower bound problem

        int low=0,high=arr.length-1,ans=-1 ;

        while(low<=high){
            int mid = low+(high-low)/2 ;

            if(arr[mid]>=x){
                ans=arr[mid] ;
                high=mid-1 ;
            }
            else
            low = mid+1 ;
        }

        return ans ;
    }

    public static void main(String[] args) {
        int[] arr = {1,20,34,45,46,47} ;

        System.out.println(getCeil(arr, 50));
    }
}
