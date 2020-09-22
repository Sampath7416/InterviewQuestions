package Searching;

public class RArraySearch {
    
    static int getMinele(int arr[])
    {
        int start=0,end=arr.length-1,res=0; 
        while(start<=end)
                  {
            if(arr[start]<=arr[end])
            {
                        res=start;
                break;
            }
            
            
            int mid=start+(end-start)/2;
            int next=(mid+1)%arr.length;
            int prev=(mid+arr.length-1)%arr.length;
           
            
            if(arr[mid]<arr[next] 
              &&
              arr[mid]<arr[prev] )
            {
                
               res= mid;
                break;
            }
            
            
            if(arr[start]<=arr[mid])
            {
                        start=mid+1;
            }
            
            if(arr[mid]<=arr[end])
            {
                end=mid-1;
            }
    
        }
        return res;
        
    }
    static int binarySearch(int[] arr,int start,int end,int ele)
    {
        
         while(start<=end)
        {
            int mid=start+(end-start)/2;
            
           
            
            if(ele==arr[mid] )
            {
                return mid;
            }
            
            
            if(ele<arr[mid])
            {
                end=mid-1;
            }
           
            if(ele >arr[mid])
            {
                start=mid+1;
            }
    
        }
        return -1;
        
    }
    public static void main(String[] args) {
        
    
    int[] arr={4,5,6,7,0,1,2};int target=0;
       
       int index=getMinele(arr);
       int b1=binarySearch(arr,index,arr.length-1,target);
       int b2=binarySearch(arr,0,index-1,target);
       // System.out.println(index+"  "+b1+"  "+b2);
        if(b1==-1 && b2==-1)
        {
            
            System.out.println( -1);
        }
        
     System.out.println( (b1>b2)?b1:b2);
        
        
        
        
    }
}
    

