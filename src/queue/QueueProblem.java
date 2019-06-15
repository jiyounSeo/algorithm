package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueProblem {
    //https://programmers.co.kr/learn/courses/30/lessons/42583
    public int solution(int bridgeLength, int maxWeight, int[] truck_weights) {
        int answer = 0;
        int minus = 0;

        Queue<Integer> queue = new LinkedList<>();
        for (int truckWeight : truck_weights) {
            queue.add(truckWeight);
        }
        int cnt = 0;

        while(!queue.isEmpty()) {
            int thisWeight = queue.poll();
            if (queue.peek() == null) {
                return answer+1;
            }
            int nextWeight = queue.peek();
            if (minus == 0) {
                if (thisWeight + nextWeight > maxWeight) {
                    answer += bridgeLength;
                } else {
                    answer += bridgeLength;
                    minus = -1;
                }
            } else {
                if (thisWeight + nextWeight > maxWeight) {
                    answer += (bridgeLength-minus);
                } else {
                    answer += (bridgeLength-minus);
                    minus = -1;
                }
            }
        }

        return answer+1;
    }

}
