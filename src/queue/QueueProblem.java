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
        int bridgeWeight = -1;

        while(bridgeWeight != 0) {
            if (IntStream.of(bridge).sum() != 0) {
                for(int i=bridgeLength-1; i>0; i--) {
                    bridge[i] = bridge[i-1];
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
        }
        return answer;
    }

}
