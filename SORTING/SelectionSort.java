package SORTING;

public class SelectionSort {
    public static void selectionSort(int[] arr){

        for(int i=0 ; i<arr.length-1 ; i++){
            for(int j=i+1 ; j<arr.length ; j++){
                if(arr[j] < arr[i])
                {
                    int temp = arr[i] ;
                    arr[i] = arr[j] ;
                    arr[j] = temp ;
                }
            }
        }
    }

    public static void main(String[] args) {
        
        int[] arr = {10,2,6,7,1,0} ;
        System.out.println("Array = ");
        for(int x : arr)
        System.out.print(x + " ");

        selectionSort(arr) ;

        System.out.println("\nArray = ");
        for(int x : arr)
        System.out.print(x + " ");

    }
}
