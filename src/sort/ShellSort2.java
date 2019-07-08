package sort;

import java.util.Arrays;
import java.util.Collections;

public class ShellSort2 {
    //https://programmers.co.kr/learn/courses/30/lessons/42746
    public String solution(int[] numbers) {
        String answer = "";

        String[] stringNumbers = Arrays.stream(numbers).mapToObj(String::valueOf).toArray(String[]::new);
        Arrays.parallelSort(stringNumbers);
        Collections.reverse(Arrays.asList(stringNumbers));

        for (int from=0; from<stringNumbers.length-1; from++) {
            if (stringNumbers[from].charAt(0) == stringNumbers[from+1].charAt(0)) {
                int to = from;
                for (int j=from; j <stringNumbers.length-1; j++) {
                    if(stringNumbers[j].charAt(0) !=  stringNumbers[j+1].charAt(0)) {
                        break;
                    }
                    to = j+1;
                }
                String[] newCopyArray = Arrays.copyOfRange(stringNumbers, from, to+1);
                if (newCopyArray.length <= 2) {
                    compare(newCopyArray, 0);
                }
                System.out.println(Arrays.toString(newCopyArray));
                // 정렬
                //
                from = to;
            } else {
                compare(stringNumbers, from);
            }
        }

        for (String number : stringNumbers) {
            answer += number;
        }

        String replaceStr = answer.replaceAll("0", "");
        if (replaceStr.equals("")) {
            return "0";
        }

        return answer;
    }

    private void compare(String[] array, int idx) {
        String x = array[idx] + array[idx+1];
        String y = array[idx+1] + array[idx];
        if (Integer.parseInt(x) < Integer.parseInt(y)) {
            swap(array, idx, idx + 1);
        }
    }

    private String[] swap(String[] array, int a, int b) {
        String temp = array[a];
        array[a] = array[b];
        array[b] = temp;
        return array;
    }


}
