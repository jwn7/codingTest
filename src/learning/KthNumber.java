/*
 * 날짜: 2026-07-11
 * 문제: K번째수
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/42748
 */
import java.util.Arrays;

public class KthNumber {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] t;
        int p = 0;
        for(int i = 0; i<commands.length;i++)
        {
            t = new int[commands[i][1] - commands[i][0] + 1];
            int idx = 0;
            for(int j = commands[i][0]-1; j < commands[i][1]; j++)
            {
                t[idx++] = array[j];
            }
            Arrays.sort(t);
            answer[p++] = t[commands[i][2]-1];
        }
        return answer;
    }
}
