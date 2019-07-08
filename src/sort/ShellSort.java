package sort;

import java.util.Arrays;
import java.util.Collections;

public class ShellSort {
    //https://programmers.co.kr/learn/courses/30/lessons/42746
    public String solution(int[] numbers) {
        String answer = "";


        String[] stringNumbers = Arrays.stream(numbers).mapToObj(String::valueOf).toArray(String[]::new);
        Arrays.parallelSort(stringNumbers);
        Collections.reverse(Arrays.asList(stringNumbers));
        System.out.println(Arrays.toString(stringNumbers));

        for (int idx=1; idx<numbers.length; idx++) {
            String number = stringNumbers[idx];
            for (int j=0; j<idx; j++) {
                String compare = stringNumbers[j];
                if (number.charAt(0) > compare.charAt(0)) {
                    stringNumbers[idx] = compare;
                    stringNumbers[j] = number;
                    number = stringNumbers[idx];
                }

                /*else if (number.charAt(0) == compare.charAt(0)) {
                    if (Integer.parseInt(number) > Integer.parseInt(compare)) {
                        stringNumbers[idx] = compare;
                        stringNumbers[j] = number;
                        number = stringNumbers[idx];
                    }
                }*/
            }
        }





/*        for (int from = 0; from < numbers.length-1; from++) {
            if(stringNumbers[from].charAt(0) ==  stringNumbers[from+1].charAt(0)) {
                int to = from;
                for (int j=from; j <stringNumbers.length-1; j++) {
                    if(stringNumbers[j].charAt(0) !=  stringNumbers[j+1].charAt(0)) {
                        break;
                    }
                    to = j+1;
                }
                String[] newCopyArray = Arrays.copyOfRange(stringNumbers, from, to+1);
                System.out.println(Arrays.toString(newCopyArray));
                // 정렬
                //
                from = to;
            }
        }*/

        for (String number : stringNumbers) {
            answer += number;
        }
        return answer;
    }

}
