package set;

import java.util.Arrays;

public class SetProblem {
    // https://programmers.co.kr/learn/courses/30/lessons/12938
    // https://programmers.co.kr/learn/courses/30/lessons/12938

    public int[] solution(int n, int s) {
        if (s < n) {
            return new int[]{-1};
        } else if (n == 1) {
            return new int[]{s};
        }
        int a = s/n;
        int c = s%n;

        int[] answer = new int[n];
        Arrays.fill(answer, a);

        if (c != 0) {
            for (int i=1; i<=n-(n-c); i++) {
                answer[n-i] = a+1;
            }
        }
        return answer;
    }

}
