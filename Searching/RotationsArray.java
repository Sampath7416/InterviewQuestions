package Searching;

public class RotationsArray {
   

    public static void main(String[] args) {
      
       
       int[] arr={4,5,6,7,0,1,2};
       if(arr[0]<arr[arr.length-1])
       {
           System.out.println("sorted 0");
       }
        
       int start=0;//11/2=5;
      int end=arr.length-1;
       while(start<=end)
       {
         if(arr[start]<=arr[end])
         {
            System.out.println(start +" "+arr[start]);
            break;
         }

           int mid=start+(end-start)/2;
         //  System.out.println(arr[mid])
        int next =(mid+1)%(arr.length);
        int prev =(mid+arr.length-1)%(arr.length);
         if( arr[mid]<=arr[next] && arr[mid]<=arr[prev])
         {
           System.out.println(mid +" "+arr[mid]);

             break;
         }
          
         if( arr[start]<=arr[mid])
         {
          start=mid+1;
         }
         if( arr[mid]<=arr[end])
         {
          end=mid-1;
         }
          
       }
      
       //in.close();
    }

}
