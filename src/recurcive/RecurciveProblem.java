package recurcive;

public class RecurciveProblem {
    //https://programmers.co.kr/learn/courses/30/lessons/12945
    public int solution(int n) {
        int temp2 = 0;
        int temp1 = 1;
        int result = 0;

        if (n == 1) {
            return 1;
        }

        for (int idx = 2; idx <= n; idx++) {
            if (idx == 2 ) {
                temp2 = 0;
                temp1 = 1;
            } else {
                temp2 = temp1;
                temp1 = result;
            }
            result = temp2 % 1234567 + temp1 % 1234567;
        }
        return result % 1234567;
    }


}
