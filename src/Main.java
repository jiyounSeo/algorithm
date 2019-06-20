import queue.QueueProblem;
import recurcive.RecurciveProblem;

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

        RecurciveProblem recurciveProblem = new RecurciveProblem();
        System.out.println(recurciveProblem.solution(100000));
    }
}
