/*
 * 날짜: 2026-08-06
 * 문제: 프로세스
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/42587
 */
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Arrays;

public class Process {
    public int solution(int[] priorities, int location) {
        Queue<Integer> q = new ArrayDeque<>();
        int[] seq = new int[priorities.length];
        int idx = seq.length - 1;
        int i = 0;
        for (int pr : priorities) {
            q.offer(pr);
            seq[i++] = pr;
        }
        Arrays.sort(seq);
        int count = 0;
        while (!q.isEmpty()) {
            int target = q.peek();
            if (target < seq[idx]) {
                q.poll();
                q.offer(target);
                if (location == 0) {
                    location = q.size() - 1;
                } else {
                    location--;
                }
            } else {
                q.poll();
                count++;
                idx--;
                if (location == 0) {
                    break;
                } else {
                    location--;
                }
            }
        }
        return count;
    }
}
