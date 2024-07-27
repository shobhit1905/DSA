package ARRAY.BINARY_SEARCH;

public class LowerAndUpperBound {
    public static int lowerBound(int[] arr , int x){
        int low=0 , high=arr.length-1 , ans = arr.length ;

        while(low<=high){
            int mid=low+(high-low)/2 ;

            if(arr[mid]>=x){
                ans = mid ;
                high = mid-1 ;
            }
            else
            low = mid+1 ;
        }

        return ans ;
    }

    public static int upperBound(int[] arr , int x){
        int low=0,high=arr.length-1,ans=arr.length ;

        while(low<=high){
            int mid=low+(high-low)/2 ;
            if(arr[mid]>x){
                ans=mid ;
                high=mid-1 ;
            }
            else
            low=mid+1 ;
        }

        return ans  ;
    }

    public static void main(String[] args) {
        int[] arr = {5,6,8,9,10,12,20,40} ;
        System.out.println(lowerBound(arr, 10));
        System.out.println(upperBound(arr, 11));
    }
}
