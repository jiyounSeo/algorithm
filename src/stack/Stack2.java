package stack;

public class Stack2 {
    //https://programmers.co.kr/learn/courses/30/lessons/42585
    public int solution(String arrangement) {
        int answer = 0;
        int index = arrangement.length()-1;
        int open = 0;
        while (index > 0 ) {
            if (')' == (arrangement.charAt(index))) {
                if ('(' == (arrangement.charAt(index-1))) {
                    answer += open;
                    index--;
                } else {
                    open++;
                }
            } else if ('(' == (arrangement.charAt(index))) {
                answer = answer+1;
                open--;
            }
            index--;
        }
        return answer;
    }
}
