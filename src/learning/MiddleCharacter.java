/*
 * 날짜: 2026-07-07
 * 문제: 가운데 글자 가져오기
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/12903
 */
public class MiddleCharacter {
    public String solution(String s) {
        int l = s.length();
        if(l % 2 == 0)
        {
            return s.substring(l/2 - 1, l/2 + 1);
        }
        else
        {
            return s.substring(l/2 , l/2 + 1);
        }
    }
}
