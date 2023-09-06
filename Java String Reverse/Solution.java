import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder s= new StringBuilder(A);
        String c = String.valueOf(s.reverse());
        
        if(A.equals(c)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
        
    }
}



