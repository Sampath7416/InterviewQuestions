package Recursion;
import java.util.HashSet;
import java.util.Scanner;


public class LetterCasePremutation {
    
    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
        String ip=in.next();
        String op="";
     //   ip.to
     HashSet<String> arr=new HashSet<String>();
        casePermutation(ip,op,arr);
       
        System.out.print(arr);
        in.close();
        
    }


    static void  casePermutation(String ip,String op,HashSet<String>arr)
    {
        if(ip.length()==0)
        {
            arr.add(op);
            return;
        }
        String op1=op+ip.charAt(0);
       char letter=ip.charAt(0);
       String upper="";
        if(Character.isLowerCase(letter))
        {
            upper=""+letter;
            upper=upper.toUpperCase();
            
        }
        if(Character.isLowerCase(letter)==false)
        {
             upper=""+letter;
            upper=upper.toLowerCase();
            
        }
        String op2=op+upper;
        
        ip=ip.substring(1);
        casePermutation(ip, op1,arr);
        casePermutation(ip, op2,arr);
        



    }
}

