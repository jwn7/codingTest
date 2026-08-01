/*
 * 날짜: 2026-08-01
 * 문제: 수박수박수박수박수박수?
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/12922
 */
public class WatermelonPattern {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        if (n == 1)
            return "수";
        boolean a = n % 2 != 0;
        while (n > 1) {
            n -= 2;
            sb.append("수박");
        }
        if (a) {
            sb.append("수");
        }
        return sb.toString();
    }
}
