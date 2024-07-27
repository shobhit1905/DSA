package ARRAY.BINARY_SEARCH;

public class LastOccurrence {

    //Using Upper Bound
    public static int lastOccurrence(int[] arr , int x){
        int low = 0 , high = arr.length-1 , ans = arr.length ;

        while(low <= high){
            int mid = (low+high)/2 ;

            if (arr[mid] > x) {
                ans = mid ;
                high = mid-1 ;
            }
            else
            low = mid+1 ;
        }

        if(ans == arr.length || arr[ans-1] != x)
        return -1 ;

        return ans-1 ;
    }

    // Using normal binary search
    public static int lastOccurr(int[] arr , int x){
        int low = 0 , ans = -1 , high = arr.length-1 ;

        while(low <= high){
            int mid = (low+high)/2 ;

            if(arr[mid] == x){
                ans = mid ;
                low = mid+1 ;
            }

            else if(arr[mid] < x)
                low = mid+1 ;
            else
                high = mid - 1 ;
        }
        
        return ans ;
    }

    public static void main(String[] args) {
        
        int[] arr = {1,2,2,4,5,7,7,7,8} ;
        System.out.println(lastOccurr(arr, 2));
    }
}
