package queue;


import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.IntStream;

public class QueueProblem {
    //https://programmers.co.kr/learn/courses/30/lessons/42583
    public int solution(int bridgeLength, int maxWeight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int truckWeight : truck_weights) {
            queue.add(truckWeight);
        }
        int[] bridge = new int[bridgeLength];
        int bridgeWeight = 0;

        while(true) {
            if (bridgeWeight > 0) {
                int i = bridgeLength-1;
                while(i > 0) {
                    bridge[i] = bridge[i-1];
                    i--;
                }
                bridge[0] = 0;
                bridgeWeight = IntStream.of(bridge).sum();
            }

            if (queue.peek() != null) {
                if (bridgeWeight + queue.peek() <= maxWeight) {
                    bridge[0] = queue.poll();
                    bridgeWeight = IntStream.of(bridge).sum();
                }
            }
            answer++;
            if(bridgeWeight == 0) {
                break;
            }
        }
        return answer;
    }

}
