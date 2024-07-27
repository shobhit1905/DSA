package ARRAY ;
public class LeadersInAnArrays {
    public static void printLeaders(int[] arr){

        for(int i=0 ; i<arr.length ; i++){
            boolean flag = true ;
            for(int j=i+1 ; j<arr.length ; j++){
                if(arr[j]>arr[i]){
                    flag = false;
                    break ;
                }
            }

            if(flag)
                System.out.print(arr[i] + " ");
        }

        //TC = O(n2)
        //AS = O(1)
    }

    public static void printLeader1(int[] arr){
        int leader = Integer.MIN_VALUE ;

        for(int i=arr.length-1 ; i>=0 ; i--){
            if(arr[i]>leader)
            {
                leader = arr[i] ;
                System.out.print(leader + " ");
            }
        }

        //TC = O(n)
        //AS = O(1)
    }

    public static void main(String[] args) {
        
        int[] arr = {10,22,12,3,0,6} ;
        printLeaders(arr);
    }
}
