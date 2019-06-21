package sort;

public class BubbleSort {
    //https://programmers.co.kr/learn/courses/30/lessons/42748
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int i =0;
        for(int[] command : commands) {
            if (command[0] == command[1]) {
                answer[i] = array[command[0]-1];
            } else {
                // command[0] 은 시작, command[1] 끝
                int[] copyArray = new int[command[1] - command[0] + 1];
                for (int cnt = 0; cnt < copyArray.length; cnt++) {
                    copyArray[cnt] = array[command[0]-1+cnt];
                }
                copyArray = bubbleSort(copyArray);
                answer[i] = copyArray[command[2]-1];
            }
            i++;
        }

        return answer;
    }
    private int[] bubbleSort(int[] array) {
        for (int i=0; i<array.length-1; i++) {
            for (int j=0; j<array.length-1-i; j++)
            if (array[j] > array[j+1]) {
                int temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }

        }
        return array;
    }
}
