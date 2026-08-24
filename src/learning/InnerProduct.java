/*
 * 날짜: 2026-08-25
 * 문제: 내적
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/70128
 */
public class InnerProduct {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }
        return answer;
    }
}
