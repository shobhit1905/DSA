package HASHING;

import java.util.Scanner;
public class FrequencyOfElements {

    public void frequency(int[] arr){

        boolean[] visited = new boolean[arr.length] ;

        for(int i = 0 ; i < arr.length ; i ++)
            visited[i] = false ;
        
        for(int i = 0 ; i < arr.length ; i ++){
            if(visited[i] == true)
            continue ;

            int count = 0 ;

            for(int j = i ; j < arr.length ; j++){
                if(arr[i] == arr[j]){
                    count ++ ;
                    visited[j] = true ;
                }
            }

            System.out.println("Frequency of " + arr[i] + " = " + count);
        }
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in) ;

        int n = sc.nextInt() ;

        int[] arr = new int[n] ;

        for(int i = 0 ; i < n ; i ++)
            arr[i] = sc.nextInt() ;

        FrequencyOfElements obj = new FrequencyOfElements() ;
        obj.frequency(arr) ;

        sc.close();
    }
}
