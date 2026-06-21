/*
 * 날짜: 2026-06-21
 * 문제: 음양 더하기
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/76501
 */
public class SignedSum {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i = 0; i<absolutes.length;i++)
        {
            if(signs[i] == true)
                answer += absolutes[i];
            else
                answer -= absolutes[i];
        }
        return answer;
    }
}
