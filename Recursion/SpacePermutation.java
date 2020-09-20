//import java.util.LinkedHashSet;
package Recursion;
import java.util.*;
import java.util.Scanner;
//[abc, ab_c, a_bc, a_b_c] linkedhaset
//[a_bc, abc, ab_c, a_b_c] haset
public class SpacePermutation {
    
    public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
    int t=in.nextInt();
    while(t-- >0)
    {
    String ip=in.next();
    int len=ip.length();
    String op="";
    SortedSet<String> arr =new TreeSet<>();
    spacePermutation(ip,op,arr); 
    StringBuffer sb=new StringBuffer();
    for(String str:arr)
    {
        if(str.length()>len){
        //if(str.length(2)==len)
     sb.append("("+str+")"); }  
    }
    sb.append("("+ip+")");
System.out.println(sb);  
    }
    in.close();
    }
   
   static void spacePermutation(String ip,String op,SortedSet<String> arr)
   {
       if(ip.length()==0)
       { 
         
           arr.add(op);
           return;

       }
       String op1="";
       String op2="";
      if( op.length()==0){
        op1=op+ip.charAt(0);
        op2=op+ip.charAt(0);
    }else{
       op1=op+ip.charAt(0);
       op2=op+" "+ip.charAt(0);
    }
       ip=ip.substring(1);
       spacePermutation(ip, op1,arr);
       spacePermutation(ip, op2,arr);

   }
}
