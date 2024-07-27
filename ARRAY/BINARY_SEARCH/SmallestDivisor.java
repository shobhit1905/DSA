package ARRAY.BINARY_SEARCH;

public class SmallestDivisor {
    
    public static int largest(int[] arr){
        int ans = 0 ;
        for(int i=0 ; i < arr.length ; i ++){
            ans = Math.max(ans,arr[i]) ;
        }

        return ans ;
    }
    public static int smallestDiv(int[] arr , int threshold) {

        for(int i=1 ; i<= largest(arr) ; i++){
            int curr = 0 ;

            for(int j = 0 ; j <arr.length ; j ++){
                curr += Math.ceil((double)arr[j]/(double)i) ;
            }

            if(curr <= threshold)
            return i ;
        }
        return -1 ;
    }

    public static int smallestDivisor(int[] arr , int threshold){
        int low = 1 ;
        int high = largest(arr) ;
        int ans = -1 ;
        while(low <= high){
            int mid = low + (high-low)/2 ;

            int sum = 0 ;

            for(int i=0 ; i<arr.length ; i ++){
                sum += Math.ceil((double)arr[i]/(double)mid) ;
            }

            if(sum <= threshold){
                ans = mid ;
                high = mid - 1;
            }
            else{
                low = mid+1 ;
            }
        }

        return ans ;
    }

    public static void main(String[] args) {
        
        int[] arr = {1,2,5,9} ;

        System.out.println(smallestDivisor(arr, 7));
    }
}
