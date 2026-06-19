/*
 * 날짜: 2026-06-19
 * 문제: 나머지가 1이 되는 수 찾기
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/87389
 */
public class RemainderOne {
    public int solution(int n) {
        int answer = 0;
        for (int i = n - 1; i >= 2; i--) {
            if (n % i == 1)
                answer = i;
        }
        return answer;
    }
}
