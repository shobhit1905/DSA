package ARRAY;

import java.util.ArrayList;

public class MoveZerosToRight {

    //Brute-Force
    public static void moveZeros(int[] arr){
        ArrayList<Integer> list = new ArrayList<>() ;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]!=0)
            list.add(arr[i]) ;
        }

        for(int i=0 ; i<list.size() ; i++){
            arr[i] = list.get(i) ;
        }

        for(int i=list.size() ; i<arr.length ; i++){
            arr[i] = 0 ;
        }

        //TC = O(n)
        //AS = O(n)
    }

    //Optimal
    public static void moveZero(int[] arr){

        int j = -1 ;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] == 0)
            {
                j=i ;
                break ;
            }
        }

        for(int i=j+1 ; i<arr.length ; i++){
            if(arr[i]!=0){
                int temp = arr[i] ;
                arr[i]=arr[j] ;
                arr[j]=temp ;
                j++ ;
            }
        }

        //TC = O(n)
        //AS = O(1)
    }

    public static void move(int[] arr){
        int j ;
        for(j=0 ; j<arr.length ; j++){
            if(arr[j]==0){
                break ;
            }
        }

        for(int i=j+1 ; i<arr.length ; i++){
            if(arr[i] != 0){
                int temp = arr[i] ;
                arr[i] = arr[j] ;
                arr[j] = temp ;
                j++ ;
            }
        }
    }

    public static void main(String[] args) {
        
        int[] a = {1,0,5,0,4,0,0,6,8} ;

        move(a);

        for(int x : a)
        System.out.print(x + " ");
    }
}
