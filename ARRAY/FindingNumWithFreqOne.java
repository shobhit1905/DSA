package ARRAY;

public class FindingNumWithFreqOne {
    
    public static int findNum(int[] arr){

        for(int i=0 ; i<arr.length ; i++){
            int num = arr[i] ;
            int count = 0 ;
            for(int j=0 ; j<arr.length ; j++){
                if(arr[j]==num)
                count ++ ;
            }

            if(count == 1)
            return num ;
        }

        return -1 ;
    }

    public static void main(String[] args) {
        
        int[] arr = {1,1,2,5,5,4,4} ;

        System.out.println(findNum(arr));
    }
}
