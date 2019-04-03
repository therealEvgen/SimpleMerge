/**
 * Created by Teacher on 1/28/2019.
 * simpleMerge takes in two sorted arrays of
 * integers and merges them to return one sorted
 * array of integers.
 */
public class SimpleMerge {
    public static int[] simpleMerge(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length+arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
            int x = 0;
            for (int j = arr1.length; j < arr3.length; j++) {
                arr3[j] = arr2[x];
                x++;
            }
        }
        bubbleSort(arr3);
        return arr3;
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void bubbleSort(int[] arr) {
        int swaps = 1;
        while (swaps!=0) {
            swaps = 0;
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] > arr[i+1]) {
                    swap(arr, i, i+1);
                    swaps++;
                }
            }
        }
    }

}
