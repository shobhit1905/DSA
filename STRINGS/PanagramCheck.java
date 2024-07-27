package STRINGS;

public class PanagramCheck {
    public static boolean panagramCheck(String s){
        if(s.length() < 26)
        return false ;

        String temp = "" ;
        String check = "qwertyuiopasdfghjklzxcvbnm" ;
        s = s.toLowerCase() ;

        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i) != ' ')
            temp += s.charAt(i) ;
        }

        for(int i=0 ; i<check.length() ; i++){
            Character ch = check.charAt(i) ;
            if(temp.contains(ch.toString()) == false)
            return false ;
        }

        return true ;
    }

    public static boolean isPanagram(String s){
        if(s.length() < 26)
        return false ;

        boolean[] visited = new boolean[26] ;

        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i) ;

            if(ch >= 'a' && ch <= 'z')
            visited[ch - 'a'] = true ;
            if(ch >= 'A' && ch <= 'Z')
            visited[ch - 'A'] = true ;
        }

        for(int i=0 ; i<26 ; i++)
        {
            if(visited[i] == false)
            return false ;
        }
        return true ;
    }

    public static void main(String[] args) {
        String s1 = "The quick brown fox jumps over the lazy dog" ;
        String s2 = "shobhit nautiyal" ;

        System.out.println(isPanagram(s1));
        System.out.println(isPanagram(s2));
    }
}
