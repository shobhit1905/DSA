package ARRAY;

public class RightRotate {
    public static void rightRotateByOne(int arr[]){
        int temp = arr[arr.length-1] ;

        for(int i = arr.length-1 ; i>0 ; i--){
            arr[i] = arr[i-1] ;
        }

        arr[0] = temp ;
    }

    public static void printArray(int[] arr){
        for(int i=0 ; i<arr.length ; i++)
        System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5} ;
        printArray(arr);

        rightRotateByOne(arr);
        printArray(arr);
    }
}
