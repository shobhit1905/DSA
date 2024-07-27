package ARRAY.BINARY_SEARCH;

public class FloorValue {
    public static int getFloor(int[] arr , int x){
        int low=0,high=arr.length-1,ans=-1 ;

        while(low<=high){
            int mid = (low+high)/2 ;

            if(arr[mid]<=x){
                ans=arr[mid] ;
                low=mid+1 ;
            }
            else
            high = mid-1 ;
        }

        return ans ;
    }

    public static void main(String[] args) {
        
        int[] arr = {10,20,30,40,50,60,70,80} ;
        System.out.println(getFloor(arr, 9));
    }
}
