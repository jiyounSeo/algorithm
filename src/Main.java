import codility.Solution;

import java.util.Arrays;

public class Main {


    public static <Solution> void main(String[] args) {
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
        sysoutArray(result); */

        /* 4주차-1 shellsort
        ShellSort2 shellSort = new ShellSort2();
//        System.out.println(shellSort.solution(new int[]{21,212}));
//        System.out.println(shellSort.solution(new int[]{12,121}));
//        System.out.println(shellSort.solution(new int[]{40,403}));
//        System.out.println(shellSort.solution(new int[]{40,405}));
        System.out.println(shellSort.solution(new int[]{40,4,404}));
//        System.out.println(shellSort.solution(new int[]{70,0,0,0,0}));
//        System.out.println(shellSort.solution(new int[]{12,1213}));
//        System.out.println(shellSort.solution(new int[]{5,546}));
        System.out.println(shellSort.solution(new int[]{20,20,200}));
//        System.out.println(shellSort.solution(new int[]{200,20,20}));
        //System.out.println(shellSort.solution(new int[]{6,10,2}));
        //System.out.println(shellSort.solution(new int[]{3,30,34,5,9}));
        //System.out.println(shellSort.solution(new int[]{10,20,30,40,50,33}));
        //System.out.println(shellSort.solution(new int[]{64, 900, 93, 921, 951, 5, 9, 432, 431, 45, 4, 40}));
    */

        /*
        SetProblem setProblem = new SetProblem();
        int[] answer = setProblem.solution(2, 9);
        System.out.println(Arrays.toString(answer));
        int[] answer2 = setProblem.solution(3, 8);
        System.out.println(Arrays.toString(answer2));
        int[] answer3 = setProblem.solution(4, 16 );
        System.out.println(Arrays.toString(answer3));

         */

   /*     StringProblem stringProblem = new StringProblem();
        int answer = stringProblem.solution(new String[]{"ba", "na", "n", "a"}, "banana");
        System.out.println(answer);
*/
        //answer = stringProblem.solution(new String[]{"app", "ap", "p", "l", "e", "ple", "pp"}, "apple");
        //System.out.println(answer);

        //answer = stringProblem.solution(new String[]{"ba", "an", "nan", "ban", "n"}, "banana");
        //System.out.println(answer);

        codility.Solution solution = new codility.Solution();
        /*int i = solution.solution1(6);
        System.out.println(i);
        */

        int a = solution.solution5_1(new int[]{0,1,0,1,1});
        System.out.println(a);


    }


}
