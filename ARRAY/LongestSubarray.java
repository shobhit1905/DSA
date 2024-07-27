package ARRAY;

import java.util.HashMap;

public class LongestSubarray {
    
    public static int longestSubarray1(int[] arr , int sum){

        int res = 0 ;

        for(int i=0 ; i<arr.length ; i++){

            for(int j=i ; j<arr.length ; j++){
                int curr_sum =  0;
                for(int k=i ; k<=j ; k++){
                    curr_sum += arr[k] ;
                }

                if(curr_sum == sum){
                    res = Math.max(res,j-i+1) ;
                }
            }
        }

        return res ;

        //TC = O(n3)
        //AS = O(1)
    }

    public static int longestSubarray2(int[] arr , int k){
        int res = 0 ;

        for(int i=0 ; i<arr.length ; i++){
            int curr_sum = 0 ;

            for(int j=i ; j<arr.length ; j++){
                curr_sum += arr[j] ;

                if(curr_sum == k)
                res = Math.max(res,j-i+1) ;
            }
        }

        return res ;

        //TC = O(n2)
        //AS = O(1)
    }

    public static int longestSubarray3(int[] arr , int k)
    {
        int sum = 0 ;
        int ans = 0 ;
        int s = 0 ;

        for(int e=0 ; e<arr.length ; e++){
            sum+=arr[e] ;

            if(sum == k)
            ans = Math.max(ans,e-s+1) ;

            while(sum > k){
                sum -= arr[s] ;
                s++ ;
            }
        }

        return ans ;

        //TC = O(n)
        //AS = O(1)
    }

    public static int longestSubarray4(int[] arr , int k){

        HashMap<Integer,Integer> map = new HashMap<>() ;
        int sum = 0 ;
        int ans = 0 ;


        for(int i=0 ; i<arr.length ; i++){

            sum+=arr[i] ;

            if(sum == k)
            ans = Math.max(ans,i+1) ;

            int rem = sum - k;

            if(map.containsKey(rem))
            {
                int len = i - map.get(rem) ;
                ans = Math.max(len,ans) ;
            }

            if(map.containsKey(sum) != true){
                map.put(sum,i) ;
            }
        }

        return ans ;
    }

    public static void main(String[] args) {
        
        int[] arr = {1,2,3,1,1,1,1,4,2,3} ;
        System.out.println(longestSubarray1(arr, 6));

        HashMap<Integer,Integer> map = new HashMap<>() ;

        map.put(1,0) ;

        System.out.println(map.containsValue(0));
    }
}
