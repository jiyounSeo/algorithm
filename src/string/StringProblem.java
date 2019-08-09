package string;

import java.util.Arrays;

public class StringProblem {
    //https://programmers.co.kr/learn/courses/30/lessons/12983
    public int solution(String[] strs, String word) {
        int answer = 0;

        //new String[]{"ba", "na", "n", "a"}, "banana"

        Arrays.sort(strs);

        System.out.println(Arrays.toString(strs));




        int lastIndexOf = word.lastIndexOf("na");
        System.out.println(lastIndexOf);
        int indexOf = word.indexOf("na");
        System.out.println(indexOf);

        for(int i=0; i<strs.length; i++) {
            if (word.contains(strs[i])) {
                word = word.replaceAll(strs[i], "");
                answer++;
            }
        }
        return answer;
    }
}
