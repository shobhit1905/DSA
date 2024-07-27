package RECURSION;

public class Questons1 {
    static void reverse(int[] arr)
    {
        int n = arr.length ;
        for(int i = 0 ; i < n/2 ; i ++)
        {
            arr[i] =  arr[i] + arr[n-1-i] ;
            arr[n-1-i] = arr[i] - arr[n-1-i] ;
            arr[i] = arr[i] - arr[n-i-1] ;
        }
    }

    static void reverse(int[] arr , int s , int e){
        if(s >= e)
        return ;

        int temp = arr[s] ;
        arr[s] = arr[e] ;
        arr[e] = temp ;
        reverse(arr , s+1 , e-1) ;
    }

    static void reverse(int[] arr , int i)
    {
        if(i >= arr.length/2)
        return ;

        int temp = arr[i] ;
        arr[i] = arr[arr.length-1-i] ;
        arr[arr.length-1-i] = temp ;

        reverse(arr,i+1) ;
    }
    
    public static void main(String[] args) {
        
        //int[] arr = {6,5,4,3,2,1} ;
        int[] brr = {1,2} ;
        reverse(brr,0);
        for(int x : brr)
        System.out.println(x);
    }
}
