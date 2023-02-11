package ArraysQuestion;

import java.util.Arrays;


public class ArraySorting {

    public static void main(String[] args) {

        // Given Array
        int[] ar = new int[] { 1, 0, 2, 0, 1, 2 };

        ArraySorting sort = new ArraySorting();
        sort.sort(ar);

        System.out.println(Arrays.toString(ar));

    }

    // Utility function to swap elements `A[i]` and `A[j]` in the array
    private static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public int[] sort(int[] ar) {
        int start = 0, mid = 0;
        int end = ar.length - 1;

        int pivot = 1;

        //{1,0,0,1,2,1}
        while (mid <= end) {

            if (ar[mid] < pivot) {

                swap(ar, start, mid);
                ++start;
                ++mid;

            } else if (ar[mid] > pivot) {
                swap(ar, mid, end);
                --end;
            } else {
                mid++;
            }

        }

        return ar;

    }
}
