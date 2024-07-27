package STRINGS ;

public class PallindromeCheck {
    public static boolean isPallindrome(String s){
        if(s.length() == 0 || s.length() == 1)
        return true ;

        String temp = "" ;
        for(int i=s.length()-1 ; i>=0 ; i--){
            temp += s.charAt(i) ;
        }

        return s.equals(temp) ;
    }

    public static boolean isPall(String s){
        if(s.length() == 0 || s.length() == 1)
        return true ;

        int i = 0 , j = s.length() - 1 ;
        while(i <= j){
            if(s.charAt(i) == s.charAt(j)){
                i ++ ;
                j -- ;
            }
            else
                return false ;
        }

        return true ;
    }

    public static void main(String[] args) {
        
        String s = "abcdcba" ;
        System.out.println(isPall(s));

        String str = "shobhit" ;
        System.out.println(isPall(str));
    }
}
