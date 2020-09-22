package Searching;

public class SquareRoot {
    static int squareRoot(int n)
    {
        int start=1,end=n/2,res=0;
        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(n/mid==mid)
            {
                return mid;
               
            }
            if(n/mid<mid)
            {
              end=mid-1;
            }
            if(n/mid>mid)
            {
                start=mid+1;
               res=mid;

            }
        }
       return res;    
    }
    public static void main(String[] args) {
        int number=-23;
        double n=(double)number;
        System.out.println(Math.sqrt(n));
        System.out.println(
        squareRoot(number));
    }
    
}
