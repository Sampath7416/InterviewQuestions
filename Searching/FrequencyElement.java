package Searching;

import java.io.*;

class FrequencyElement {
    static void  binarySearch(int[] arr,int ele){
       int start=0,first=-1,last=-1;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(ele<arr[mid])
            {
                end=mid-1;
            }
            if(ele>arr[mid])
            {
                start=mid+1;
            }
            if(ele==arr[mid])
            {
                first=mid;
                end=mid-1;
               
            }
        }
        start=0;end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(ele<arr[mid])
            {
                end=mid-1;
            }
            if(ele>arr[mid])
            {
                start=mid+1;
            }
            if(ele==arr[mid])
            { last=mid;
                start=mid+1;
               
            }
        }
        if(first==-1 ||last==-1)
        { System.out.println("-1");}
        else{

        System.out.println((last-first)+1);
        }
        }
	public static void main (String[] args)  throws IOException{
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
        binarySearch(arr,ele);
        
         
           }
	}
}