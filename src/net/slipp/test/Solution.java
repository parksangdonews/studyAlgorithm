package net.slipp.test;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int[] A = {1,2,3,1,2,3,4};
        List<Integer> numbers = new LinkedList<Integer>();

        solution(A);

        numbers.add(1);
        numbers.add(3);
        numbers.add(6);
        numbers.add(7);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        // insert merge 삽입정렬
        insertMergeSort(numbers);

        // quick sort 퀵 정렬
        quickSort(numbers);








    }

    private static List<Integer> quickSort(List<Integer> numbers) {

        if (numbers.size() < 2) {
            System.out.println(numbers.toString());
            return numbers;
        }
        final Integer pivot = numbers.get(0); // 기준값
        final List<Integer> lower = new ArrayList<>();
        final List<Integer> higher = new ArrayList<>();

        for (int i = 1; i < numbers.size(); i++) {  // 루핑 중 기준값보다 낮거나 높을 때, i = 1 주의 (0 x)
            if (numbers.get(i) < pivot) {
                lower.add(numbers.get(i)); // 낮은 리스트로
            } else {
                higher.add(numbers.get(i)); // 높은 리스트로
            }
        }

        List<Integer> sorted = quickSort(lower);
        sorted.add(pivot);
        sorted.addAll(quickSort(higher));

        System.out.println(sorted.toString());
        return sorted;

    }

    private static int solution(int[] A) {

        int rst = 0;
        // blah

        Map<String, String> env = (Map<String, String>) System.getenv();

        System.out.println(env.toString());
/*

        try {
            System.out.println(InetAddress.getLocalHost().getHostAddress());
            System.out.println(InetAddress.getLocalHost().getAddress().toString());
            System.out.println(InetAddress.getLocalHost().getHostName());
            System.out.println(InetAddress.getLocalHost().getCanonicalHostName());


        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

*/




        // bubble sort 버블정렬
        bubbleSort(A);


        return rst;
    }

    private static void insertMergeSort(List<Integer> numbers) {

        final List<Integer> sortedList = new LinkedList<>();

        //System.out.println(sortedList.get(0));

        originalList: for (Integer number : numbers) {      // 전체 영역 반복
            for (int i = 0; i < sortedList.size(); i++) {   // 정렬된 배열에서 돌면서 순서 맞는 위치에 비교된 값 넣기(insert)
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
