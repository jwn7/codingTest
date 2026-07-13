/*
 * 날짜: 2026-07-13
 * 문제: 수열과 구간 쿼리 3
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/181924
 */
public class SequenceAndIntervalQuery3 {
    public int[] solution(int[] arr, int[][] queries) {
        for(int[] q : queries)
        {
            int temp = arr[q[0]];
            arr[q[0]] = arr[q[1]];
            arr[q[1]] = temp;
        }
        return arr;
    }
}
