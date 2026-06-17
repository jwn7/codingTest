/*
 * 날짜: 2026-06-17
 * 문제: 짝수와 홀수
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/12937
 */
class Solution {
    public String solution(int num) {
        String answer = "";
        if(num % 2 == 0)
            answer = "Even";
        else
            answer = "Odd";
        return answer;
    }
}
