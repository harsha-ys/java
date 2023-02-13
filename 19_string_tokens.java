import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String[] tokens = s.replaceAll("[!,?._'@]+", " ").trim().split(" +");
        if ( tokens.length == 1 && tokens[0].equals("") ) System.out.println(0);
        else
        {
        System.out.println(tokens.length);
        for(String i : tokens ) System.out.println(i);    
        }
        scan.close();
        
    }
}

