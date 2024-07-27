package ARRAY;

public class FindMissingNumber {
    //Brute_force
    public static int findNumber(int[] arr , int n){

        for(int i=1 ; i<=n ; i++){
            boolean flag = false ;

            for(int j=0 ; j<arr.length-1 ; j++){
                if(arr[j] == i){
                    flag = true ;
                    break ;
                }
            }

            if(flag == false)
            return i ;
        }

        return -1 ;

        //TC = O(n2)
        //AS = O(1)
    }

    //Better
    public static int findNum(int[] arr , int n){
        int[] hash = new int[n+1] ;

        int res = 0 ;

        for(int i=0 ; i<arr.length-1 ; i++){
            hash[arr[i]] = 1 ;
        }

        for(int i=1 ; i<=n ; i++){
            if(hash[i]==0){
                res = i ;
                break ;
            }
        }

        return res ;

        //TC = O(n)
        //AS = O(n)
    }

    public static int findMissing(int[] arr , int n){
        int sum = (n*(n+1))/2 ;

        int sumArr = 0 ;

        for(int i=0 ; i<arr.length-1 ; i++)
            sumArr += arr[i] ;

        return (sum - sumArr) ;

        //TC = O(n)
        //AS = O(1)
    }

    public static int find(int[] arr , int n){

        int xor1 = 0, xor2 = 0 ;

        for(int i=0 ; i<arr.length-1 ; i++){
            xor2 = xor2^arr[i] ;
            xor1 = xor1^(i+1) ;
        }

        xor1=xor1^n ;

        return xor1^xor2 ;

        //TC = O(n)
        //AS = O(1)
    }

    public static void main(String[] args) {
        
        int[] arr = new int[5] ;

        arr[0] = 2 ;
        arr[1] = 5 ;
        arr[2] = 4 ;
        arr[3] = 1 ;

        System.out.println(find(arr, 5));
    }
}
