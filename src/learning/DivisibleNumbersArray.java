import java.util.Arrays;

/*
 * 날짜: 2026-07-04
 * 문제: 나누어 떨어지는 숫자 배열
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/12910
 */
public class DivisibleNumbersArray {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = new int[arr.length];
        int t = 0;
        for(int k : arr)
        {
            if(k % divisor == 0)
                answer[t++] = k;
        }
        if(t== 0)
        {
            int[] j = new int[1];
            j[0] = -1;
            return j;
        }
        int[] result =Arrays.copyOf(answer,t);
        Arrays.sort(result);
        return result;
    }
}
