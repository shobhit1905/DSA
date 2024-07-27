package HASHING;

import java.util.Scanner ;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        char[] arr = {'a','c','z','e','i','t','e','t','t','u','i','b','c','u','z','p','o'} ;

        int[] hash = new int[26] ;

        for(int i = 0 ; i < arr.length ; i ++)
        hash[arr[i] - 'a'] += 1 ;
        int i = 10 ;
        while(i-- > 0){
            char ch = sc.next().charAt(0);
            System.out.println(hash[ch-97]);
        }

        sc.close();
    }
}
