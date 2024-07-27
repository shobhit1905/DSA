package ARRAY.BINARY_SEARCH;

public class Basic {
    public static int binarySearchIterative(int[] arr , int x){
        int low=0 , high=arr.length-1 ;
        while(low<=high){
            int mid=low+(high-low)/2 ; // to avoid overflow of int
            if(arr[mid] == x)
            return mid ;
            else if(arr[mid]>x)
            high=mid-1 ;
            else
            low=mid+1 ;
        }

        return -1 ;
    }

    public static int binarySearchRecursive(int[] arr , int low , int high , int x){
        if(low>high)
        return -1 ;

        int mid = low+(high-low)/2 ;
        if(arr[mid]==x)
            return mid ;
        else if(arr[mid]>x)
            return binarySearchRecursive(arr, low, mid-1, x) ;
        else
            return binarySearchRecursive(arr, mid+1, high, x) ;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,10,20,23} ;

        System.out.println(binarySearchIterative(arr, 11));
        System.out.println(binarySearchIterative(arr, 20));
        System.out.println(binarySearchRecursive(arr, 0, arr.length-1, 11));
        System.out.println(binarySearchRecursive(arr, 0, arr.length-1, 20));
    }
}
