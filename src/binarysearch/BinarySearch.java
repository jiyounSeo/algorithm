package binarysearch;

import java.util.Arrays;
import java.util.stream.IntStream;


public class BinarySearch {
    // 문제 :  https://programmers.co.kr/learn/courses/30/lessons/43237?language=java

    public int solution(int[] budgets, int M) {

        if (IntStream.of(budgets).sum() <= M) {
            return IntStream.of(budgets).max().orElse(0);
        }

        Arrays.sort(budgets);

        int index = 0;
        int result = M;
        int i=0;

        while (result > budgets[index]) {
            budgets = Arrays.copyOfRange(budgets, index, budgets.length);
            int average = M/budgets.length;
            index = Arrays.binarySearch(budgets, average);
            index = (index < 0) ? Math.abs(index) - 1 : index + 1;
            M = M - IntStream.of(Arrays.copyOfRange(budgets, 0, index)).sum();
            result = M / (budgets.length - index);
            i++;
        }
        System.out.println(i);
        return result;
    }



}
