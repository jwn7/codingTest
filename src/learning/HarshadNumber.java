/*
 * 날짜: 2026-06-28
 * 문제: 하샤드 수
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/12947
 */
public class HarshadNumber {
    public boolean solution(int x) {
        boolean answer = true;
        String t = Integer.toString(x);
        int tot = 0;
        for(int i = 0; i<t.length();i++)
        {
            tot += t.charAt(i) - '0';
        }
        return x % tot == 0;
    }
}
