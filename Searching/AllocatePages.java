package Searching;


import java.io.*;

class AllocatePages {
   
    static boolean isValid(int arr[],int div,int mid)
    {
       int sum=0,stu=1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>mid)
            {
                return false;
            }
            if((sum+arr[i])>mid)
            {
                stu++; 
                sum=arr[i];
                if(stu>div)
                {
                    return false;
                }
            }
            else{
                sum=sum+arr[i];
            }            
        }
        return true;
        
    }
    
    static int  slove(int arr[],int div)
    {     
        long sum=0;
        if(arr.length<div)
        {
            return -1;
        }
        for(int a:arr){sum+=a;}
          int res=Integer.MAX_VALUE;
          long start=0;
          long end=sum,mid=0;
          
          while(start<=end)
          {
             mid=start+(end-start)/2;
             
             if(isValid(arr,div,(int)mid)==true)
             {
                 res=Math.min(res,(int)mid);
                end=mid-1;
                 
             }
             else
             {
                 start=mid+1;
             }
             
             
          }
        
       return res; 
        
        
    }

	public static void main (String[] args) throws IOException{
	
	    int[] arr={12,34,67,90};
	     System.out.println(slove(arr,2));
	     
	 
	}
}