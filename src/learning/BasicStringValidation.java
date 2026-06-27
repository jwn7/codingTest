/*
 * 날짜: 2026-06-27
 * 문제: 문자열 다루기 기본
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/12918
 */
public class BasicStringValidation {
    public boolean solution(String s) {
        for(int i = 0; i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(!Character.isDigit(ch))
            {
                return false;
            }
        }
        return s.length() == 4 | s.length() == 6;
    }
}
