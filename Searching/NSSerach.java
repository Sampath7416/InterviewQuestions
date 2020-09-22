package Searching;

public class NSSerach {

    static int binarySearch(int[] arr,int start,int end,int ele)
    {
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(ele==arr[mid] )
            {
                return mid;
            }
            if(mid-1>=start && ele==arr[mid-1])
            {
                return mid-1;
            }
            if(mid+1<=end && ele==arr[mid+1])
            {
                return mid+1;
            }
            
            if(ele<arr[mid])
            {
                end=mid-2;
            }
           
            if(ele >arr[mid])
            {
                start=mid+2;
            }
    
        }

        return -1;
        
    }
    public static void main(String[] args) {
        int arr[] =  {10, 3, 40, 20, 50, 80, 70}, key = 40;
       
        System.out.println( binarySearch( arr,0,arr.length-1,key));
}
    
}