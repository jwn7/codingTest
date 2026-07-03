import java.util.Arrays;

/*
 * 날짜: 2026-07-03
 * 문제: 정수 내림차순으로 배치하기
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/12933
 */
public class SortDigitsDescending {
    public long solution(long n) {
        String t = String.valueOf(n);
        String[] arr = t.split("");
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for(String k : arr)
        {
            sb.append(k);
        }
        return Long.parseLong(sb.reverse().toString());
    }
}
