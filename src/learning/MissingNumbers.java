/*
 * 날짜: 2026-06-20
 * 문제: 없는 숫자 더하기
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/86051
 */
public class MissingNumbers {
    public int solution(int[] numbers) {
        int answer = 45;
        for(int i = 0; i<numbers.length;i++)
        {
            answer -= numbers[i];
        }
        return answer;
    }
}
