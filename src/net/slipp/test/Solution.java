package net.slipp.test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        int[] A = {1,2,3,1,2,3,4};
        solution(A);

        List<Integer> numbers = new LinkedList<Integer>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(6);
        numbers.add(7);
        numbers.add(3);
        numbers.add(2);
        // insert merge 삽입정렬
        insertMergeSort(numbers);



    }

    private static int solution(int[] A) {

        int rst = 0;
        // blah

        // bubble sort 버블정렬
        bubbleSort(A);


        return rst;
    }

    private static void insertMergeSort(List<Integer> numbers) {

        final List<Integer> sortedList = new LinkedList<>();

        originalList: for (Integer number : numbers) {      // 전체 영역 반복
            for (int i = 0; i < sortedList.size(); i++) {   // 정렬된 ?
                if(number < sortedList.get(i)) {
                    sortedList.add(i, number);
                    continue originalList;
                }
            }
            sortedList.add(sortedList.size(), number);
        }
        System.out.println(sortedList.toString());
    }

    private static void bubbleSort(int[] a) {

        boolean switched = false;
        System.out.println(Arrays.toString(a));

        int count = 0;
        do {
            switched = false;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i + 1] < a[i]) {
                //if (a[i + 1] < a[i]) { // desc
                    int temp = a[i+1];
                    a[i + 1] = a[i];
                    a[i] = temp;
                    switched = true;
                } // if
            } // for
            System.out.println(count++);
        } while(switched);
        System.out.println(Arrays.toString(a));
    }






}
