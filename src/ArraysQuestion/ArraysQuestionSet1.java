package ArraysQuestion;

import java.util.Arrays;


public class ArraysQuestionSet1 {

    public static void main(String[] args) {

        ArraysQuestionSet1 aq = new ArraysQuestionSet1();

        int[] ar = new int[] { 2, 3, 5, 7, 10 };
        int[] reverse = aq.reverse(ar);

        System.out.println(Arrays.toString(reverse));
        aq.MaxMin(ar);
    }

    // Reverse Arrays
    public int[] reverse(int[] ar) {

        int i = 0;
        int n = ar.length - 1;

        while (i < n) {

            int temp = ar[i];
            ar[i] = ar[n];
            ar[n] = temp;

            i++;
            n--;

        }

        return ar;
    }
    // Find Max and Min element in array
    public void MaxMin(int[] ar) {

        int max = ar[0];
        int min = ar[0];

        for (int i = 0; i < ar.length; i++) {

            if (ar[i] > max) {
                max = ar[i];
            } else if (ar[i] < min) {
                min = ar[i];
            }
        }
        System.out.println("Max element " + max);
        System.out.println("Min element " + min);

    }
}
