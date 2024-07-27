package ARRAY;


import java.util.HashMap;
import java.util.Map;
public class MajorityElement {
    public static void majority1(int[] arr){

        for(int i=0 ; i<arr.length; i++){
            int count = 0 ;
            for(int j=i ; j<arr.length ; j++){
                if(arr[j]==arr[i]){
                    count ++ ;
                }
            }

            if(count > Math.floor(arr.length/2))
            System.out.println(arr[i]);
        }

        //TC = O(n2)
        //AS = O(1)
    }

    public static void majority2(int[] arr){

        HashMap<Integer,Integer> map = new HashMap<>() ;

        for(int i=0 ; i<arr.length ; i++)
        map.put(arr[i],map.getOrDefault(arr[i],0)+1) ;

        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue() > Math.floor(arr.length/2))
            System.out.println(e.getKey());
        }

        //TC = O(n)
        //AS = O(n)
    }

    public static int majority3(int[] arr){

        int element = -1 ;
        int count = 0 ;

        for(int i=0 ; i<arr.length ; i++){
            if(count == 0){
                element = arr[i] ;
                count = 1 ;
            }
            else if(arr[i] == element)
            count ++ ;
            else
            count -- ;
        }

        // if it is given that majority element is always present do not use this loop
        
        int checkCount = 0 ;

        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] == element)
            checkCount ++ ;
        }

        if(checkCount > Math.floor(arr.length)/2)
        return element ;
        else
        return -1 ;

        //TC = O(n)
        //AS = O(1)
    }

    public static void main(String[] args) {
        
        int arr[] = {1,2,2,3,4,2,2,4,2} ;

        System.out.println(majority3(arr)) ;
    }
}
