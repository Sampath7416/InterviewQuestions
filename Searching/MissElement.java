package Searching;

  import java.io.*;
        import java.util.*;
        
        public class MissElement {
            
            public static void main(String[] args) throws IOException {
                BufferedReader br =
                    new BufferedReader(new InputStreamReader(System.in));
        
                int t = Integer.parseInt(br.readLine().trim());
                while (t-- > 0) {
                    int n = Integer.parseInt(br.readLine().trim());
                    String[] str = br.readLine().trim().split(" ");
                    int[] array = new int[n - 1];
                    for (int i = 0; i < n - 1; i++) {
                        array[i] = Integer.parseInt(str[i]);
                    }
                    Solution sln = new Solution();
                    System.out.println(sln.MissingNumber(array, n));
                }
            }
        }// } Driver Code Ends
        
        
        // User function Template for Java
        
        class Solution {
            
            
            int MissingNumber(int arr[], int n) {
        
            int total=1;
             
             for(int i=2;i<=n;i++)
             {
                 total+=i;       //3 5 7 9  
                 total-=arr[i-2];//2 3 4 4
             }                   
          
        
             return total;
             
            }
        }

