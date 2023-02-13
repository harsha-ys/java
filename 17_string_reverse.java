import java.io.*;
import java.util.*;

public class Solution {
    
    public static String reverse(String s)
    {
        if ( s.length()==0) return "";
        return s.substring(s.length()-1)+reverse(s.substring(0,s.length()-1));
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        //System.out.println(reverse( A.substring(Math.floorDiv(A.length(), 2)+1) ));
        //System.out.println(reverse( "c" ));
        
        System.out.println(  (A.length()%2 ==1)?  ( A.substring(0,Math.floorDiv(A.length(), 2)).equals( reverse( A.substring(Math.floorDiv(A.length(), 2)+1) ) )) ? "Yes" : "No" :  ( A.substring(0,Math.floorDiv(A.length(), 2)).equals( reverse( A.substring(Math.floorDiv(A.length(), 2)) ) )) ? "Yes" : "No" );
        
        
    }
}



