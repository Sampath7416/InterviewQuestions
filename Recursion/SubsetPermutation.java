package Recursion;
import java.util.ArrayList;
import java.util.Scanner;

public class SubsetPermutation {
   static  ArrayList<String> str=new ArrayList<String>(); 
    static void permutationofStrings(String ip,String op)
     {
       
         if(ip.length()==0)
         {
             str.add("["+op+"]");
             return ;
         }
         String op1=op;
         ;String op2=op+""+ip.charAt(0);
        // System.out.println(op1+"  "+op2);
         
         ip= ip.substring(1);
        System.out.println("->  "+ip);
       
       
      permutationofStrings(ip, op1);
      permutationofStrings(ip, op2);    
                
         
     }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next(),op="";
        
        permutationofStrings(s,op);
        System.out.println(str);
        in.close();
    }
}
