/*
 * 날짜: 2026-06-30
 * 문제: 약수의 합
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/12928
 */
public class SumOfDivisors {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i<=n;i++)
        {
            if(n % i == 0)
                answer+=i;
        }
        return answer;
    }
}
