package Searching;

public class NextAplha {
static char  nextAplha(char arr[],char target,int start,int end)
    {
        char c='0';
        
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                start=mid+1;
            }
            if(arr[mid]>target)
            {
                c=arr[mid];
             end=mid-1;
                
            }
            if(arr[mid]<target)
            {
               start=mid+1;
            }
            

        }
        return c;

    }
    
    public static void main(String[] args) {
        char arr[]={'a','b','c','f','h'},target='b',res='0';
      
       res= nextAplha(arr, target, 0,arr.length-1);
            
        
       
        System.out.println(res);
    }
}
