package SORTING;

public class MergeSort {
    
    public static void merge(int[] arr , int low , int high , int mid){

        int l = mid-low+1 ;
        int r = high-mid ;

        int[] left = new int[l] ;
        int[] right = new int[r] ;

        for(int i=0 ; i<l ; i++)
            left[i] = arr[low+i] ;

        for(int i=0 ; i<r ; i++)
            right[i] = arr[mid+i+1] ;

        int i=0 , j=0 , k=0 ;

        while(i<l && j<r){
            if(left[i] < right[j])
                arr[low+k++] = left[i++] ;
            else if(left[i] > right[j])
                arr[low+k++] = right[j++] ;
            else{
                arr[low+k++] = left[i++] ;
                j++ ;
            }
        }

        while(i<l)
            arr[low+k++] = left[i++] ;
        while(j<r)
            arr[low+k++] = right[j++] ;

    }

    public static void mergeSort(int[] arr , int low , int high){
        if(low < high){
            int mid = (low + high)/2 ;
            mergeSort(arr,low,mid) ;
            mergeSort(arr,mid+1,high) ;
            merge(arr,low,high,mid) ;
        }
    }

    public static void main(String[] args) {
        
        int[] arr = {1,50,2,30,12,10,9,10} ;

        for(int x : arr)
        System.out.print(x+" ");

        mergeSort(arr,0,7) ;

        System.out.println();
        for(int x : arr)
        System.out.print(x+" ") ;
    }
}
