package ARRAY;

public class numberOfSubarraysWithGivenSum {
    public static int numberSubarrays(int[] arr , int k){
        int res = 0 ;
        for(int i=0 ; i<arr.length ; i++){
            int sum = 0 ;
            for(int j=i ; j<arr.length ; j++){
                sum+=arr[j] ;

                if(sum == k)
                res++ ;
            }
        }

        return res ;
    }
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,-3,1,1,1,4,2,-3} ;

        System.out.println(numberSubarrays(arr, 2));
    }
}
