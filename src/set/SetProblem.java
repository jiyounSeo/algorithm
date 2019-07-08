package set;

import java.util.Arrays;

public class SetProblem {
    // https://programmers.co.kr/learn/courses/30/lessons/12938
    public int[] solution(int n, int s) {
        if (s < n) {
            return new int[]{-1};
        } else if (n == 1) {
            return new int[]{s};
        }
        int average = s/n;
        int remain = s%n;

        int[] answer = new int[n];
        Arrays.fill(answer, average);

        if (remain != 0) {
            for (int i=1; i<=remain; i++) {
                answer[n-i] = average+1;
            }
        }
        return answer;
    }

}
