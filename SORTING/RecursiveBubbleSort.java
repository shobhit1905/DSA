package SORTING;

public class RecursiveBubbleSort {
    
    public static void bubbleSort(int[] arr , int size)
    {
        if(size == 1)
        return ;

        boolean swap = false ;

        for(int i=0 ; i<size-1 ; i++){
            if(arr[i] > arr[i+1]){
                arr[i] = arr[i]+arr[i+1] ;
                arr[i+1] = arr[i]-arr[i+1] ;
                arr[i] = arr[i]-arr[i+1] ;
                swap = true ;
            }
        }

        if(swap != true)
        return ;

        bubbleSort(arr, size-1);
    }

    public static void main(String[] args) {
        int[] arr = {9,20,5,14,70,1,71} ;
        System.out.println("Array = ");
        for(int x : arr)
        System.out.print(x + " ");

        bubbleSort(arr,arr.length) ;

        System.out.println("\nArray = ");
        for(int x : arr)
        System.out.print(x + " ");
    }
}
