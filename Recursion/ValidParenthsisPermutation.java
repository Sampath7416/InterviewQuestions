package Recursion;

import java.util.ArrayList;
import java.util.Scanner;
//           ValidParenthsisPermutation.java
public class ValidParenthsisPermutation{
    static void bPPermutation
    (ArrayList<String> list,String op,int open,int close)
    {
        if(open==0 && close==0)
        {
            list.add(op);
            return;
        }
        
        if(open!=0)
        {
            String op1 =op+"(";
            bPPermutation(list,op1,open-1,close);


        }
        if(open<close)
        {
            String op2=op+")";
            bPPermutation(list,op2,open,close-1);
        }


    }
    static ArrayList<String> balencedParenthsisPermutation(int n)
    {
       
        ArrayList<String> list=new ArrayList<>();
        int open=n,close=n;
        String op=""; 
        bPPermutation(list,op,open,close);

        return list;
        
    }
public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
    ArrayList<String> arr=new ArrayList<>();
    int n=in.nextInt();
    arr=balencedParenthsisPermutation(n);
    System.out.println(arr);
    in.close();


}    
}
