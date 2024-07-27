package RECURSION;

public class PallidromeString {
    
    public static boolean pallindromeString(String str)
    {
        if(str.length() == 0)
        return true ;

        String res = "" ;

        for(int i = str.length() - 1 ; i >= 0 ; i --)
        {
            Character ch = str.charAt(i) ;
            res = res + ch.toString() ;
        }

        return str.equals(res) ;
    }

    public static boolean pallindromeString(String str , int i , int j)
    {
        if(i >= j)
        return true ;

        return (str.charAt(i) == str.charAt(j)) && pallindromeString(str,i+1,j-1) ;
    }

    public static void main(String[] args) {
        
        String s1 = "MADAM" ;
        String s2 = "jygeyuvb" ;
        String s3 = "a" ;
        System.out.println(pallindromeString(s1,0,s1.length()-1));
        System.out.println(pallindromeString(s2,0,s2.length()-1));
        System.out.println(pallindromeString(s3,0,s3.length()-1));
    }
}
