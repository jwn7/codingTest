/*
 * 날짜: 2026-07-14
 * 문제: 수열과 구간 쿼리 2
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/181923
 */
public class SequenceAndIntervalQuery2 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] ans = new int[queries.length];
        int idx = 0;

        for(int[] q : queries)
        {
            int min = 1000001;

            for(int i = q[0]; i <= q[1]; i++)
            {
                if(arr[i] > q[2])
                {
                    if(arr[i] < min)
                        min = arr[i];
                }
            }

            ans[idx++] = (min == 1000001) ? -1 : min;
        }

        return ans;
    }
}
