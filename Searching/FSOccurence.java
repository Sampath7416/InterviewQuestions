package Searching;



public class FSOccurence {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 5, 5, 5 ,67, 123, 125} ; int ele=5;  
        int start=0,first=0,last=0;
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

        System.out.print(first+" "+last);
    }
    
}
