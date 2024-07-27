package STRINGS;

public class BasicStringFunctions {
    public static void main(String[] args) {
        // String str1 = "Shobhit Nautiyal" ;
        // //OR
        // String str2 = new String("Shobhit Nautiyal") ;

        // System.out.println(str1.length());
        // System.out.println(str1.charAt(3));
        // System.out.println(str2.substring(6));
        // System.out.println(str2.substring(4,8));

        // String str3 = "Shobhit Nautiyal" ;

        // System.out.println(str1 == str3);
        // System.out.println(str2 == str3);
        

        // String s1 = "geeksForgeeks" ;
        // String s2 = "geeks" ;

        // System.out.println(s1.contains(s2)) ;
        // System.out.println(s1.contains("for"));
        // System.out.println(s1.equals(s2));
        // System.out.println(s2.equals("geeks"));

        // int ans = s1.compareTo(s2) ;

        // if(ans == 0)
        // System.out.println("s1 is equal to s2");
        // else if(ans > 0)
        // System.out.println("s1 is lexographically greater than s2");
        // else
        // System.out.println("s2 is lexographically greater than s1");

        String s1 = "geeksForgeeks" ;
        String s2 = "geeks" ;

        System.out.println(s1.indexOf(s2,1));
        System.out.println(s1.lastIndexOf(s2,7));

        s2 = s2 + "forgeeks" ;

        System.out.println(s2);
        System.out.println(s1 == s2);

        String s3 = s2.toUpperCase() ;
        System.out.println(s3);

    }
}
