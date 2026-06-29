/*
 * 날짜: 2026-06-29
 * 문제: 자릿수 더하기
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/12931
 */
public class DigitSum {
    public int solution(int n) {
        int answer = 0;
        while(n>=10)
        {
            answer += n%10;
            n /= 10;
        }
        return answer + n;
    }
}
