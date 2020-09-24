
package Searching;
public class BinarySortedSeachOne {

        static int[] getStartEnd(int arr[],int ele)
        {
            int start_End[]=new int[2];
            int start=0;
            int end=1;
             while(ele>arr[end])
             {
                 start=end;
                 end =end*2;
        
             }
             start_End[0]=start;
             start_End[1]=end;
        
            return start_End;
        
        
        }
        static int binarySearch(int[]  arr,int ele,int start,int end)  
        {
            int res=-1;
            while(start<=end)
            {
                int mid=start+(end-start)/2;
                if(arr[mid]==ele)
                {res=mid;
                    end=mid-1;
                }
                if(arr[mid]<ele)
                {
                    start=mid+1;
                }
                if(arr[mid]>ele)
                {
                    end=mid-1;
                }
            }
            
            return res;
        }  
        public static void main(String[] args) {
            int[] arr={0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1};
            int ele=1;
            int start_end[]=getStartEnd(arr,ele);
            int start=start_end[0],end=start_end[1];
            System.out.println(
            binarySearch(arr, ele, start, end));
        }
        }
        
