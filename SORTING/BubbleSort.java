package SORTING;

public class BubbleSort {
    
    public static void bubbleSort(int[] arr){

        for(int i=0 ; i<arr.length-1 ; i++){
            for(int j=0 ; j<arr.length-i-1 ; j++){
                if(arr[j+1]<arr[j]){
                    int temp = arr[j] ;
                    arr[j] = arr[j+1] ;
                    arr[j+1] = temp ;
                }
            }
        }
    }

    public static void optimizedBubbleSort(int[] arr){

        for(int i=0 ; i<arr.length-1 ; i++){
            boolean flag = false ;  
            for(int j=0 ; j<arr.length-i-1 ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j] ;
                    arr[j] = arr[j+1] ;
                    arr[j+1] = temp ;
                    flag = true ;
                }
            }

            if(flag == false)
                break ;
            

            System.out.println("runs");
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50} ;
        System.out.println("Array = ");
        for(int x : arr)
        System.out.print(x + " ");

        optimizedBubbleSort(arr) ;

        System.out.println("\nArray = ");
        for(int x : arr)
        System.out.print(x + " ");
    }
}
