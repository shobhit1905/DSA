package ARRAY.BINARY_SEARCH;

public class NthRootOfM {
    public static int nRoot(int n, int m) {
        for (int i = 1; i <= m; i++) {
            int curr = 1;
            for (int j = 1; j <= n; j++) {
                curr = curr * i;
            }

            if (curr > m)
                break;
            else if (curr == m)
                return i;
        }

        return -1;
    }

    public static int calcPower(int a , int b){
        if(b == 0)
        return 1 ;

        int temp ;

        temp = calcPower(a,b/2) ;

        if(b % 2 == 0){
            return temp*temp ;
        }
        else
            return temp*temp*a ;
    }

    public static int nthRoot(int n , int m){
        int low = 1 , high = m ;
        while(low <= high){
            int mid = (low + high)/2 ;
            int val =1 ;
            for(int i=0 ; i<n ; i++){
                val = val*mid ;

                if(val > m)
                break;
            }

            if(val == m)
            return mid ;
            else if(val > m)
            high = mid-1 ;
            else
            low = mid+1 ;
        }

        return -1 ;
    }

    public static void main(String[] args) {
        
        System.out.println(nthRoot(3, 27));
        System.out.println(nthRoot(3, 64));
        System.out.println(nthRoot(4, 65));
    }
}
