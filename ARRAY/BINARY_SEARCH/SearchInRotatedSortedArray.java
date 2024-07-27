package ARRAY.BINARY_SEARCH;

public class SearchInRotatedSortedArray {
    public static int searchRotatedArray(int[] arr , int target){
        int low = 0 , high = arr.length-1 ;

        while(low<=high){
            int mid = (low+high)/2 ;

            if(arr[mid] == target)
                return mid ;

            if(arr[low] <= arr[mid]){
                if(target >= arr[low] && target < arr[mid])
                    high = mid-1 ;
                else 
                    low = mid+1 ;
            }
            else{
                if(target > arr[mid] && target <= arr[high])
                    low = mid+1 ;
                else
                    high = mid-1 ;
            }
        }

        return -1 ;
    }

    public static void main(String[] args) {
        
        int[] arr = {7,8,9,1,2,3,4,5,6} ;
        System.out.println(searchRotatedArray(arr, 1));

        int[] brr = {10,20,40,60,5,8} ;
        System.out.println(searchRotatedArray(brr, 8));

        int[] crr = {100,500,10,20,30,40,50} ;
        System.out.println(searchRotatedArray(crr, 500));
    }
}
