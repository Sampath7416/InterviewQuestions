package Recursion;

import java.util.ArrayList;

public class JoshepsDeathGame {
    static void solve(ArrayList<Integer>arr,int n,int k, int index)
    {
        if(arr.size()==1)
        {
            System.out.println(arr);
            return;
        
        }
         index=(index+k)%arr.size();
         arr.remove(index);
         solve(arr, n, k, index);


    }
    public static void main(String[] args) {
        int n=40;int k=7;
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            arr.add(i+1);
        }
        solve(arr,n,(k-1),0);
    }
}
