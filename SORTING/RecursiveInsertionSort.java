package SORTING;

public class RecursiveInsertionSort {
    
    public static void insertionSort(int[] arr , int i){
        if(i == arr.length)
        return ;

        int ind = i ;
        while(ind>0 && arr[ind]<arr[ind-1]){
            arr[ind]=arr[ind]+arr[ind-1] ;
            arr[ind-1]=arr[ind]-arr[ind-1] ;
            arr[ind]=arr[ind]-arr[ind-1] ;
            ind-- ;
        }

        insertionSort(arr,i+1) ;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,40,50,30,1} ;

        insertionSort(arr,1);

        for(int x : arr)
        System.out.println(x);
    }
}
