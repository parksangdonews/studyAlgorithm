package net.slipp.test;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] A = {1,2,3,1,2,3,4};
        solution(A);
    }

    private static int solution(int[] A) {

        int rst = 0;
        // blah blah
        // bubble sort
        bubbleSort(A);
        return rst;
    }

    private static int[] bubbleSort(int[] a) {

        boolean switched = false;
        System.out.println(Arrays.toString(a));

        int count = 0;
        do {
            switched = false;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i + 1] > a[i]) {
                    int temp = a[i+1];
                    a[i + 1] = a[i];
                    a[i] = temp;
                    switched = true;
                } // if
            } // for
            System.out.println(count++);
        } while(switched);

        System.out.println(Arrays.toString(a));

        return a;
    }
}
