package Searching;

public class TwoDimensionSearch {
    static int  getElement(int[][] mat,int ele)
    {
       
        int m=mat.length,n=mat[0].length,i=0,j=n-1,res=0;
        while(i>=0 && i<m && j>=0 && j<n)
        {
            if(mat[i][j]==ele)
            {
               return 1;
            }
            else if(mat[i][j]>ele)
            {
                j--;
            }
           else if(mat[i][j]<ele)
            {
                i++;
            }


        }
        return res;

    }
   
    public static void main(String[] args) {
       int ele=29,mat[][] = { {10, 20, 30, 40},
                      {15, 25, 35, 45},
                      {27, 29, 37, 48},
                      {32, 33, 39, 50}
                    };

       System.out.println(       getElement(mat,ele));
    }
}
