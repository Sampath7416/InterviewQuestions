package Searching;

public class MaxBiotic {
    static int maxBiotic(final int[] arr,final int n)
    {
        int start=0,end=n-1,res=0;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(mid<=n-2 && mid>=1)
            {
             if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1])
            {
                return mid;
            }
          
             else if(arr[mid-1]>arr[mid])
            {
                end=mid-1;
            

            }
         else  if(arr[mid+1]>arr[mid])
            {
                start=mid+1;
            }
        
       
            }
            else if(mid==0)
             {
                 if(arr[0]>arr[1])
                 {
                     return 0;
                 }
                 return 1;
             }
         else if(mid==n-1)
             {
                 if(arr[n-1]>arr[n-2])
                 {
                     return n-1;
                 }
                 return n-2;
             }


        }
         return res;

    }

    public static void main(String[] args) {
    int arr[]={1,2,1,2,1};

   System.out.println( maxBiotic(arr,arr.length));


}    
}
