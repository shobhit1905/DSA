package ARRAY;

public class RemoveDuplicateElements {
    public static void removeDuplicates(int[] arr){
        int[] res = new int[arr.length] ;
        int k=0 ;
        res[k++] = arr[0] ;
        for(int i=1 ; i<arr.length ; i++){
            if(arr[i]!=res[k-1])
            res[k++] = arr[i] ;
        }

        for(int i=0 ; i<k ; i++)
        System.out.print(res[i] + " ");

        //TC = O(n)
        //AS = O(n)
    }

    public static int removeDuplicateElements(int[] arr){
        int counter = 0 ;
        for(int i=1 ; i<arr.length ; i++){
            if(arr[i] != arr[counter]){
                arr[++counter] = arr[i] ;
            }
        }

        return counter ;

        //TC = O(n)
        //AS = O(1)
    }

    public static void main(String[] args) {
        int[] arr = {10,10,10,10,20,20,20,20,30,30,30,30,30,40,50} ;
        int size = removeDuplicateElements(arr) ;

        for(int i=0 ; i<=size ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
