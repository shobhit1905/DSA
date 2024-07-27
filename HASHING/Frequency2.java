package HASHING;
import java.util.HashMap;
import java.util.Map ;
import java.util.Scanner;
//Using hashmap
public class Frequency2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int[] arr = new int[n] ;

        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt() ;
        }

        HashMap<Integer,Integer> map = new HashMap<>() ;

        for(int i=0 ; i<n ; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1) ;
        }

        // int i = 10 ;

        // while(i-- > 0){
        //     int num = sc.nextInt() ;
        //     System.out.println(String.format("Frequency of %d = %d", num,map.get(arr[i])));
        // }

        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        sc.close();
    }
}
