import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=0;j<n;j++)
            {
                int out=a;
                for(int s=0;s<=j;s++)  out += Math.pow(2,s)*b;  
                System.out.printf("%d ",out);
            }
            System.out.printf("\n");
        }
        in.close();
    }
}
