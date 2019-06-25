package sort;

public class ShellSort {
    //https://programmers.co.kr/learn/courses/30/lessons/42746
    public String solution(int[] numbers) {
        String answer = "";
        for (int idx=1; idx<numbers.length; idx++) {
            int number = numbers[idx];
            for (int j=0; j<idx; j++) {
                int compare = numbers[j];

                System.out.println("number " + number + ", compare : " + compare);
                if (String.valueOf(number).charAt(0) < String.valueOf(compare).charAt(0)) {
                    numbers[idx] = compare;
                    numbers[j] = number;
                    break;
                }
            }
        }
        for (int i=numbers.length-1; i>=0; i--) {
            answer += numbers[i];
        }
        return answer;
    }

}
