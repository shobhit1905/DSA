package ARRAY ;

public class LeftRotate {
    public static void leftRotateByOne(int[] arr){
        int temp = arr[0] ;
        for(int i=0 ; i<arr.length-1 ; i++){
            arr[i] = arr[i+1] ;
        }

        arr[arr.length-1] = temp ;
    }

    public static void printArray(int[] arr){
        for(int i=0 ; i<arr.length ; i++)
        System.out.print(arr[i] + " ");
        System.out.println();
    }

    //Brute-force
    public static void leftRotateByD1(int[] arr , int d){
        d = d % arr.length ;

        int[] temp = new int[d] ;

        for(int i=0 ; i<d ; i++){
            temp[i] = arr[i] ;
        }

        for(int i=d ; i<arr.length ; i++){
            arr[i-d] = arr[i] ;
        }

        for(int i=arr.length-d ; i<arr.length ; i++){
            arr[i] = temp[i-(arr.length-d)] ;
        }

        //TC = O(n)
        //AS = O(d)
    }

    //Optimal
    public static void leftRotateByD2(int[] arr , int d){
        d = d % arr.length ;

        reverse(arr,0,d-1) ;
        reverse(arr,d,arr.length-1) ;
        reverse(arr,0,arr.length-1) ;
    }

    public static void reverse(int[] arr , int low , int high){

        while(low < high){
            arr[low] = arr[low] + arr[high] ;
            arr[high] = arr[low] - arr[high] ;
            arr[low] = arr[low] - arr[high] ;
            low++ ;
            high-- ;
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6} ;
        printArray(a);
        //leftRotateByOne(a);
        leftRotateByD2(a,100);
        printArray(a);

    }
}
