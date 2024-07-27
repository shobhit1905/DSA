package ARRAY.BINARY_SEARCH ;

public class FirstOccurrence {

    //Using lower bound
    public static int firstOccurence(int[] arr , int x){
        int ans = arr.length , low = 0 , high = arr.length - 1 ;
        while(low <= high){
            int mid = (low+high)/2 ;

            if(arr[mid] >= x){
                ans = mid ;
                high = mid - 1 ;
            }
            else
            low = mid+1 ;
        }

        if(ans == arr.length || arr[ans] != x)
        return -1 ;

        return ans ;
    }

    // Using normal binary search

    public static int firstOccur(int[] arr , int x){
        int ans = -1 , low = 0 , high = arr.length -1 ;
        while(low <= high){
            int mid = (low+high)/2 ;

            if(arr[mid] == x){
                ans = mid ;
                high = mid-1 ;
            }
            else if(arr[mid] < x)
                low = mid +1 ;
            else
                high = mid - 1 ;
        }

        return ans ;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,2,4,8,9} ;
        System.out.println(firstOccur(arr, 2));
    }
}
