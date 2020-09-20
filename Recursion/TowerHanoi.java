package Recursion;
import java.util.*;

public class TowerHanoi {
   static void tOH(String source,String help,String des,int disks)
   {
       if(disks==1)
       {
           System.out.println("mov from "+source+" to "+des);
           return;
       }
       tOH(source, des,help, disks-1);
       System.out.println("mov from "+source+" to "+des);
       tOH( help,source,des,disks-1);


   }

    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.println("enter no of disks : ");
    int disks=in.nextInt();
  
      tOH("1","2","3",disks);
      in.close();
        
    }
}
