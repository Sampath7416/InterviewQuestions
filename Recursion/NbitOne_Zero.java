package Recursion;


// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class NbitOne_Zero {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            ArrayList<String> result = ob.NBitBinary(n);
            for(String value  : result){
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static void  permut(String op, ArrayList<String> list, int one,int zero,int n)
    {
        if(n==0)
        
        {
         list.add(op);   
            return;
        }
        String op1=op+"1";
         permut(op1,list,one+1,zero,n-1);
         if(zero<one)
         {
          String op2=op+"0";
         permut(op2,list,one,zero+1,n-1);   
         }
        
    }
    ArrayList<String> NBitBinary(int N) {
        ArrayList<String> arr=new ArrayList<String>();
        String op="";
        int one=0,zero=0;
       permut(op,arr,one,zero,N);
       return arr;
    }
}