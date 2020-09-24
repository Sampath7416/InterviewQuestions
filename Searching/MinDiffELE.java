package Searching;
public class MinDiffELE {
    static int   binarySearch(int arr[],int ele)
    {
        int res=0,left=0,right=0,rightmid=0,leftmid=0;
        
        int start=0;//11/2=5;
       int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
          //  System.out.println(arr[mid]);
            if(arr[mid]==ele)
            {
                return arr[mid];
            }
         
          if(arr[mid]<ele)
            {
                right=Math.abs(arr[mid]-ele);
                rightmid=arr[mid];
               start=mid+1;

            }
           else
            {
                left=Math.abs(arr[mid]-ele);
                leftmid=arr[mid];
                end=mid-1;
                
            }
        }
       if(left<=right)
       {
           res=leftmid;
       }
       else  if(right<=left){
           res=rightmid;

       }
       return res;

        
        
    }
    
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,8,82,92},ele=6;
       System.out.println( binarySearch(arr, ele));
    }
}
