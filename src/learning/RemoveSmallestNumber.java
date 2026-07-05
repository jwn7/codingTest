/*
 * 날짜: 2026-07-05
 * 문제: 제일 작은 수 제거하기
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/12935
 */
public class RemoveSmallestNumber {
    public int[] solution(int[] arr) {
        int min = arr[0];
        for(int i = 1; i<arr.length;i++)
        {
            if(min > arr[i])
                min = arr[i];
        }
        if(arr.length == 1)
        {
            int[] r = new int[1];
            r[0] = -1;
            return r;
        }
        else
        {
            int[] r = new int [arr.length - 1];
            int idx = 0;
            for(int t : arr)
            {
                if(t == min)
                {
                    continue;
                }
                r[idx++] = t;
            }
            return r;
        }
    }
}
