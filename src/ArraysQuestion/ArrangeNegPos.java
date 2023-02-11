package ArraysQuestion;

import java.util.Arrays;


public class ArrangeNegPos {

    public static void main(String[] args) {
        // Givem Array
        int[] ar = new int[] { -12, 11, 0, -13, -5, 6, -7, 5, -3, 11 };
        ArrangeNegPos arrange = new ArrangeNegPos();

        System.out.println(Arrays.toString(ar));

        arrange.arrange(ar);
        System.out.println(Arrays.toString(ar));
        System.out.println("======");

        // second appprach
        ar = new int[] { -12, 11, 0, -13, -5, 6, -7, 5, -3, 11 };
        System.out.println(Arrays.toString(ar));
        arrange.rearrange(ar);
        System.out.println(Arrays.toString(ar));

    }

    public void arrange(int[] ar) {

        int start = 0, pivot = 0;
        int end = ar.length - 1;

        while (start < end) {
            if (ar[start] < 0) {
                swap(ar, pivot, start);
                pivot++;
            }
            start++;
        }

    }

    private void swap(int[] ar, int pivot, int start) {
        int temp = ar[pivot];
        ar[pivot] = ar[start];
        ar[start] = temp;
    }

    // second approach
    public void rearrange(int[] ar) {
        int start = 0, pivot = 0;
        int end = ar.length - 1;

        while (start < end) {
            if (ar[start] < 0) {
                start++;
            } else if (ar[end] > 0) {
                end--;
            } else {
                swap(ar, start, end);
                start++;
                end--;
            }
        }

    }
}
