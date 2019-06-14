package binarysearch;

public class Solution {
    public int solution(int[] budgets, int M) {
        int answer = 0;
        int start = 1, mid = 0, end = 0, totalBuget = 0;
        for(int i = 0; i < budgets.length; i++) {
            if(end < budgets[i]) {
                end = budgets[i];
            }
        }
        while(start <= end) {
            mid = (start + end) / 2;
            totalBuget = totalBudget(budgets, mid);
            if(totalBuget == M) {
                answer = M;
                break;
            }else if(totalBuget > M) {
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        answer = totalBuget > M ? mid - 1 : mid;
        return answer;
    }
    int totalBudget(int[] budgets, int M) {
        int sum = 0;
        for(int i = 0; i < budgets.length; i++) {
            if(budgets[i] < M) {
                sum += budgets[i];
            }else {
                sum += M;
            }
        }
        return sum;
    }
}