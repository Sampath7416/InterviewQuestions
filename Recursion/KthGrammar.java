package Recursion;
class KthGrammar
{
    
    public static void main(String[] args) {
     int n=3,k=3;
     
     System.out.println(gram(n,k));   
    }

    static int  gram(int n,int k)
    {

        if(n==1 && k==1)
        {
            
            return 0;
        }
        else if(n==2 && k==1)
        {
        //    System.out.println(0);
            return 0;
        }
        else if(n==2 && k==2)
        {
          //  System.out.println(1);
            return 1;
        }
        else{
        int mid=(int)Math.pow(2,n-2);
           
        if(k<=mid)
        {
        return  gram(n-1,k);
        }
        else
        {
        return 1^gram(n-1, k-(mid));
        }
    }
    
    }
}
