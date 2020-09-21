package Searching;
/*package whatever //do not write package name here */


import java.io.*;

public class BinarySearch {
    static int   binarySearch(int arr[],int ele)
    {
        
        int start=0;//11/2=5;
       int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
          //  System.out.println(arr[mid]);
            if(arr[mid]==ele)
            {
                return 1;
            }
         
          if(arr[mid]<ele)
            {
               start=mid+1;

            }
           else
            {
                end=mid-1;
                
            }
        }
        return -1;

        
        
    }
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
         binarySearch(arr,ele));
    }
    }
}

