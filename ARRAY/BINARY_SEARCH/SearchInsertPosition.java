package ARRAY.BINARY_SEARCH;

public class SearchInsertPosition {
    public static int searchInsertPosition(int[] arr , int x){
        // we have to find the minimum index where x can be inserted without disrupting the sorted pattern OR x is already present
        // array elemenst are distinct

        int low=0,high=arr.length-1,ans=arr.length ;

        while(low<=high){
            int mid=(low+high)/2 ;

            if(arr[mid]>=x){
                ans=mid ;
                high=mid-1 ;
            }
            else
            low=mid+1 ;
        }

        return ans ;
    }

    public static void main(String[] args) {
        
        int[] arr = {1,2,4,7} ;
        System.out.println(searchInsertPosition(arr, 6));
    }
}
