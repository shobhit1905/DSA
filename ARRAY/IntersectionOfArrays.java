package ARRAY;

import java.util.ArrayList;

public class IntersectionOfArrays {
    //Brute-force
    public static void intersection(int[] A , int[] B){
        if(A.length == 0 || B.length == 0)
        return ;
        
        boolean[] visited = new boolean[B.length] ;

        ArrayList<Integer> list = new ArrayList<>() ;

        for(int i=0 ; i<A.length ; i++){
            for(int j=0 ; j<B.length ; j++){
                if(B[j] == A[i] && visited[j]!=true){
                    list.add(A[i]) ;
                    visited[j] = true ;
                    break ;
                }

                if(B[j] > A[i])
                break ;
            }
        }

        System.out.print("Intersection of A[] and B[] => " + list);
    }

    public static void main(String[] args) {
        
        int[] arr = {1,2,2,3,3,4,5,6} ;
        int[] brr = {2,3,3,4,5,5} ;

        intersection(arr, brr);
    }
}
