
/*
 *
 * @author Sampath Raja Raghupathi
 */
public class DS1 {

    public static int[] apply(int arr[]) {
        /* 0   1   2  3  4  5
       [1 , 1 , 2 ,2 ,3 ,3 ]
        arr[]={1}
        1 1 2 2 3 3
         1  2 2 3 3
        1 2 2 3 3
         2  2 3 3
         arr[]={1,2}
         2 2 3 3
          2  3 3
            3  3 
        arr[]={1,2,3}
         3  3
           3  //no next elemmet stop. array complted
        
        finally array is {1,2,3}
        
        
        arr[]={1,2,3};
        arr[]={1};
        1 2 3
          2 3 
        arr[]={1,2}
          2 3
           3
        arr[]={1,2,3];
 
        
         */

        System.out.println("");
        int size = arr.length - 1, j = 0, count = 0;
        int arr1[] = new int[arr.length];
        arr1[j++] = arr[0];

        for (int i = 0; i < size; i++) {

            if (arr[i] == arr[i + 1]) {

                arr[i] = arr[i + 1];

                count++;

            } else {

                arr[i] = arr[i + 1];
                arr1[j++] = arr[i];

            }

        }

        int array[] = new int[arr.length - count];
        for (int i = 0; i < array.length; i++) {
            array[i] = arr1[i];//
        }
        return array;
    }

    public static void main(String[] args) {//    0 1 2 3
        int arr[] = {1, 1, 2, 2, 3, 3};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }

        }

        int array[] = apply(arr);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "   ");
        }

    }

}
