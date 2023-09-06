import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        boolean flag = true; 
           
        for(int i=0; i<s.length(); i++){
        
        if(s.charAt(i) == ' '){           
                
                      
        }else{
            flag = false;
        }    
            
        }
        if(flag == true){
            
            System.out.println("0");     
        }
              
        if(flag == false){
       
        String b= s.trim();
        String[] S1=b.split("[\\s\\p{Punct}]+");
        
        System.out.println(S1.length);
        for(String t : S1){
            if(!t.isEmpty())
            System.out.println(t);
        }
        }
        scan.close();
    }
    
}

