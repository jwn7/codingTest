/*
 * 날짜: 2026-07-12
 * 문제: 수열과 구간 쿼리 1
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/181883
 */
public class SequenceAndIntervalQuery1 {
    public int[] solution(int[] arr, int[][] queries) {
        for(int i = 0; i<queries.length;i++)
        {
            for(int j = queries[i][0]; j<=queries[i][1];j++)
            {
                arr[j]++;
            }
        }
        return arr;
    }
}
