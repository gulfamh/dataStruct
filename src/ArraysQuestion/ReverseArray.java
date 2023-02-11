package ArraysQuestion;

import java.util.Arrays;


public class ReverseArray {

    public static void main(String[] args) {

        ReverseArray rev = new ReverseArray();

        int[] ar = { 2, 3, 45, 5, 7 };
        //System.out.println("Before reverse " + Arrays.toString(ar));
        //int[] reverse = rev.reverse(ar);
        //System.out.println("after reverse " + Arrays.toString(reverse));

        int[] recreverse = rev.recreverse(ar, 0, ar.length - 1);

        // System.out.println(Arrays.toString(recreverse));

        //int ptr = 1;
        //System.out.println(">>>>"+((ptr++)+2));
        int[] integers = new int[] { 20, 98, 12, 7, 35 };
        System.out.println(rev.getMax(integers));
        System.out.println(rev.getMin(integers));
        System.out.println(Arrays.toString(rev.getMinMax(integers)));

    }

    public int[] reverse(int[] ar) {

        int start = 0;
        int end = ar.length - 1;
        int temp = 0;
        while (start < end) {

            temp = ar[start];
            ar[start] = ar[end];
            ar[end] = temp;
            start++;
            end--;

        }
        return ar;
    }

    // reverse by recurrion
    public int[] recreverse(int[] ar, int start, int end) {

        if (start >= end) {
            return ar;
        }
        int temp = 0;
        temp = ar[start];
        ar[start] = ar[end];
        ar[end] = temp;

        return recreverse(ar, ++start, --end);
    }

    //find max using java 8
    public int getMax(int[] integers) {
        int max = Arrays.stream(integers)
                .max()
                .getAsInt();
        return max;
    }

    //find min using java 8
    public int getMin(int[] integers) {
        int min = Arrays.stream(integers)
                .min()
                .getAsInt();
        return min;
    }

    //        int[] integers = new int[] { 20, 98, 12, 7, 35 };
    public int[] getMinMax(int[] ar) {

        int[] res = new int[] { Integer.MAX_VALUE, Integer.MIN_VALUE };

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] < res[0]) {
                res[0] = ar[i];
            }
            if (ar[i] > res[1]) {
                res[1] = ar[i];
            }
        }
        return res;
    }

}
