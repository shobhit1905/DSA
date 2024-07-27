package ARRAY;

public class MaxSubarraySum {
    public static int maxSubarraySum1(int[] arr){
        int res = Integer.MIN_VALUE ;

        for(int i=0 ; i<arr.length ; i++){
            int curr_sum = 0 ;
            for(int j=i ; j<arr.length ; j++){
                curr_sum += arr[j] ;

                res = Math.max(res,curr_sum) ;
            }
        }

        return res ;
    }

    public static void printSubarrayWithMaxSum(int[] arr){
        int res = arr[0] ;
        int maxLastSum = arr[0] ;
        int s=0 , e=0 ;

        for(int i=0 ; i<arr.length ; i++){
            maxLastSum = Math.max(maxLastSum+arr[i] , arr[i]) ;
            if(maxLastSum == arr[i])
            s = i ;

            res = Math.max(res,maxLastSum) ;

            if(res == maxLastSum)
            e=i ;
        }

        for(int i=s ; i<=e ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        int[] arr = {-2,-3,4,-1,-2,1,5,-3} ;
        System.out.println(maxSubarraySum1(arr));
        printSubarrayWithMaxSum(arr);

        int[] brr = {1,-2,3,4} ;
        System.out.println(maxSubarraySum1(brr));
        printSubarrayWithMaxSum(brr);

        int[] crr = {-10,-2,-3,-10} ;
        System.out.println(maxSubarraySum1(crr));
        printSubarrayWithMaxSum(crr);
    }
}
