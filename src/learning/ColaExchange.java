/*
 * 날짜: 2026-08-02
 * 문제: 콜라 문제
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/132267
 */
public class ColaExchange {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int rest = 0;
        while (n >= a) {
            answer += (n / a) * b;
            rest = n % a;
            n = (n / a) * b + rest;
        }

        return answer;
    }
}
