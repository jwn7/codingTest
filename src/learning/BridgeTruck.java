/*
 * 날짜: 2026-08-11
 * 문제: 다리를 지나는 트럭
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/42583
 */
import java.util.Queue;
import java.util.ArrayDeque;

public class BridgeTruck {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int sec = 0;
        int totalWeight = 0;
        int idx = 0;
        Queue<Integer> q = new ArrayDeque<>();
        int[] bridge = new int[truck_weights.length];
        for (int i : truck_weights) {
            q.offer(i);
        }
        while (!q.isEmpty() || bridge[truck_weights.length - 1] != 0) {
            for (int i = 0; i < idx; i++) {
                bridge[i]--;
                if (bridge[i] == 0) {
                    totalWeight -= truck_weights[i];
                }
            }
            if (!q.isEmpty()) {
                int current = q.peek();
                if (totalWeight + current <= weight) {
                    totalWeight += q.poll();
                    bridge[idx++] = bridge_length;
                }
            }
            sec++;
        }
        return sec;
    }
}
