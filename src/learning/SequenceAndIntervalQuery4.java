/*
 * 날짜: 2026-07-15
 * 문제: 수열과 구간 쿼리 4
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/181922
 */
public class SequenceAndIntervalQuery4 {
    public int[] solution(int[] arr, int[][] queries) {
        for(int[] q : queries)
        {
            for(int i = q[0]; i <= q[1]; i++)
            {
                if(i % q[2] == 0)
                    arr[i]++;
            }
        }
        return arr;
    }
}
