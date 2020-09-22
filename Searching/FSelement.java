package Searching;

import java.util.Scanner;

public class FSelement {

	
		//super code
        static int   binarySearch(int arr[],int ele,int start,int end)
          {
        int res=-1;
       
        while(start<=end)
        {
            int mid=start+(end-start)/2;
          //  System.out.println(arr[mid]);
            if(arr[mid]==ele)
            {
                res=mid;
                break;
            }
         
          if(arr[mid]<ele )
            {
                
             res=mid;
             start=mid+1;

            }
           else if(arr[mid]>ele)
            {
                end=mid-1;
                
            }
        }
        return res;

        
        
    }
        public static void main(String args[]){
  
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-- >0)
		{
		    int size=in.nextInt();
		    int ele=in.nextInt();
		    int[] arr=new int[size];
		    for(int i=0;i<arr.length;i++)
		    {
		      
		      arr[i]=in.nextInt();
		    }
		    if(arr[0]>ele)
		    {
		       System.out.println(-1);}
		   int mid=0+((arr.length-1)-0)/2;
		   if(arr[mid]==ele)
		   {
		       System.out.println(mid);
		   }
		      //10>5
		    if(arr[mid]>ele)
		   {
		     System.out.println( binarySearch(arr,ele,0,mid-1));
		   }
		    if(arr[mid]<ele)
		   {
		        System.out.println(binarySearch(arr,ele,mid+1,arr.length-1));
		   }
		   
		    
		}
		in.close();
		
	}


}

    

  