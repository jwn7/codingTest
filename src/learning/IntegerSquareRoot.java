/*
 * 날짜: 2026-07-01
 * 문제: 정수 제곱근 판별
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/12934
 */
public class IntegerSquareRoot {
    public long solution(long n) {
        long answer = 0;
        if(Math.sqrt(n) != (long) Math.sqrt(n))
            return -1;
        return (long) Math.pow(Math.sqrt(n)+1,2);
    }
}
