package stack;

public class Stack {
    //https://programmers.co.kr/learn/courses/30/lessons/42585
    public int solution(String arrangement) {

        int answer = 0;
        int index = 0;
        int open = 0;

        while (index <= arrangement.length()-1) {
            if ("(".charAt(0) == (arrangement.charAt(index))) {
                if (")".charAt(0) == (arrangement.charAt(index+1))) {
                    answer += open;
                    index++;
                } else {
                    open++;
                }
            } else if (")".charAt(0) == (arrangement.charAt(index))) {
                answer = answer+1;
                open--;
            }
            index++;
        }
        return answer;
    }
}
