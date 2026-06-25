/*
 * 날짜: 2026-06-25
 * 문제: 문자열 내 p와 y의 개수
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/12916
 */
public class CountPY {
    boolean solution(String s) {
        String t = s.toLowerCase();
        int c = 0;
        for(int i = 0; i<t.length();i++)
        {
            if(t.charAt(i) == 'p')
            {
                c++;
            }
            else if(t.charAt(i) == 'y')
            {
                c--;
            }
            else
            {
                continue;
            }
        }
        return (c != 0) ? false : true;
    }
}
