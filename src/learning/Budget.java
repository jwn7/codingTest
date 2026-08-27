/*
 * 날짜: 2026-08-27
 * 문제: 예산
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/12982
 */
import java.util.Arrays;

public class Budget {
    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);

        int current = 0;
        for (int i = 0; i < d.length; i++) {
            if (current == budget) {
                break;
            }
            if (current + d[i] > budget) {
                continue;
            }

            current += d[i];
            answer++;
        }
        return answer;
    }
}
