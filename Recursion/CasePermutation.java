package Recursion;
import java.util.ArrayList;
import java.util.Scanner;

public class CasePermutation {
    
    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
        String ip=in.next();
        String op="";
     ArrayList<String> arr=new ArrayList<>();
        casePermutation(ip,op,arr);
       
        System.out.print(arr);
        in.close();
        
    }


    static void  casePermutation(String ip,String op,ArrayList<String>arr)
    {
        if(ip.length()==0)
        {
            arr.add(op);
            return;
        }
        String op1=op+ip.charAt(0);
        String op2=op+(""+ip.charAt(0)).toUpperCase() ;
        ip=ip.substring(1);
        casePermutation(ip, op1,arr);
        casePermutation(ip, op2,arr);
        



    }
}
