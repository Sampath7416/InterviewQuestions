package Searching;


public class BioticSearch {
    public static int peakElement( int[] arr,  int n,int start,int end) {
        // add code here.
      
         int res = 0;
        while (start <= end) {
             int mid = start + (end - start) / 2;
            if (mid < n - 1 && mid > 0) {

                if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                    return mid;
                }

                else if (arr[mid - 1] > arr[mid]) {
                    end = mid - 1;
                } else if (arr[mid + 1] > arr[mid]) {
                    start = mid + 1;
                }
            }

            else if (mid == 0) {
                if (arr[0] > arr[1]) {
                    return 0;
                }
                return 1;

            } else if (mid == n - 1) {
                if (arr[n - 2] > arr[n - 1]) {
                    return n - 2;
                }

                return n - 1;

            }
        }
        return res;

    }
    static int dscbinarySearch(int arr[],int ele,int start,int end)
    {
        int res=-1;
        while(start<=end)
        {
         int mid=start+(end-start)/2;
          if(arr[mid]==ele)
          {
              res=mid;
              break;
          }
          else if(arr[mid]<ele)
          {
              end=mid-1;
          }
          else if(arr[mid]>ele)
          {
            start=mid+1;
          }

        }
        return res;
    }
    static int ascbinarySearch(int arr[],int ele,int start,int end)
    {
        int res=-1;
        while(start<=end)
        {
         int mid=start+(end-start)/2;
          if(arr[mid]==ele)
          {
              res=mid;
              break;
          }
          else if(arr[mid]<ele)
          {
              start=mid+1;
          }
          else if(arr[mid]>ele)
          {
              end=start-1;
          }

        }
        return res;
    }
    static int bioticSearch(int[] arr,int ele)
    {
        int res=-1;
        int peakelement=peakElement(arr, arr.length-1,0,arr.length-1);
     
        int firsthalf= Searching.BioticSearch.ascbinarySearch(arr, ele,0,peakelement);
        int secondhalf= Searching.BioticSearch.dscbinarySearch(arr, ele,peakelement+1,arr.length-1);
        if(firsthalf!=-1){
        res=firsthalf;}
        if(secondhalf!=-1){
            res=secondhalf;}
    
      return res;
    }
  public static void main(String[] args) {
   int arr[] = {-3, 9, 8, 20, 17, 5, 1},
    key = 20;
    System.out.println(bioticSearch(arr, key));
   
  }
    
}

  