package Searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinarySeachRecusrion {
  public static void main(String[] args) throws IOException{
    BufferedReader in=new BufferedReader(new InputStreamReader
    (System.in));

    int t=Integer.parseInt(in.readLine().trim());
    while(t-- >0){
        String nk[]=in.readLine().split(" ");
    int n=Integer.parseInt(nk[0]);
    int ele=Integer.parseInt(nk[1]);
    
    int[] arr=new int[n];
     String array[]=in.readLine().split(" ");
    for(int i=0;i<arr.length;i++)
    {
        arr[i]=Integer.parseInt(array[i]);
        //System.out.println(arr[i]);
    }
    System.out.println(
     binarySearch(arr,ele,0,(arr.length-1)));
}
  }  

 static int  binarySearch(int[] arr,int ele,int start,int end)
  {
      if(start<=end){
      int mid=start+(end-start)/2;
    if(arr[mid]==ele)
    {
        return mid;
        
    }
    else if(arr[mid]<ele)
    {
        return binarySearch(arr,ele,mid+1,end);

    }
    else if(arr[mid]>ele)
    {
        return binarySearch(arr,ele,start,mid-1);

    }
}
      
       return -1;
      
   


}

  
}
