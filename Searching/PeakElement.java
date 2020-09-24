
package Searching;
public class PeakElement {
    public static int peakElement(final int[] arr, final int n) {
        // add code here.
        int start = 0, end = n - 1;
        final int res = 0;
        while (start <= end) {
            final int mid = start + (end - start) / 2;
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

    public static void main(final String[] args) {
        final int arr[] = { 1, 2, 1, 2, 1
        };
        System.out.println(
        peakElement(arr,arr.length)
        );

    }
}
