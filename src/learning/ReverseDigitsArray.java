import java.util.Arrays;

/*
 * 날짜: 2026-07-02
 * 문제: 자연수 뒤집어 배열로 만들기
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/12932
 */
public class ReverseDigitsArray {
    public long[] solution(long n) {
        long[] answer = new long[13];
        int idx = 0;
        while(n >= 1)
        {
            answer[idx++] = n % 10;
            n /= 10;
        }

        return Arrays.copyOf(answer,idx);
    }
}
