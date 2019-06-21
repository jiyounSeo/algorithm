import queue.QueueProblem;
import recurcive.RecurciveProblem;
import sort.BubbleSort;

public class Main {


    public static void main(String[] args) {
        /* 1주차
        BinarySearch binarySearch = new BinarySearch();
        int result = binarySearch.solution(new int[]{120, 110, 140, 150}, 485);
        System.out.println(result);
         */

        /* 2주차-1 - stack
        Stack stack = new Stack();
        System.out.println(stack.solution("()(((()())(())()))(())"));
         */

        /* 2주차-2 - queue
        QueueProblem queueProblem = new QueueProblem();
        System.out.println(queueProblem.solution(2, 10, new int[]{7,4,5,6}));
        System.out.println(queueProblem.solution(3, 10, new int[]{7,4,5,4,6}));
        System.out.println(queueProblem.solution(100, 100, new int[]{10}));
        System.out.println(queueProblem.solution(100, 100, new int[]{10,10,10,10,10,10,10,10,10,10}));
         */

        /* 3주차-1 재귀
        RecurciveProblem recurciveProblem = new RecurciveProblem();
        System.out.println(recurciveProblem.solution(100000));
         */

        /* 3주차-2 bubblesort
        BubbleSort bubbleSort = new BubbleSort();
        int[] result = bubbleSort.solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2,5,3},{4,4,1},{1,7,3}});
        sysoutArray(result);
    }

    private static void sysoutArray(int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
