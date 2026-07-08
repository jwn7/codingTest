import java.util.Arrays;

/*
 * 날짜: 2026-07-08
 * 문제: 문자열 내림차순으로 배치하기
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/12917
 */
public class SortStringDescending {
    public String solution(String s) {
        char[] t = s.toCharArray();
        Arrays.sort(t);
        StringBuilder sb = new StringBuilder();
        for(int i = t.length - 1; i >= 0; i--)
        {
            sb.append(t[i]);
        }
        return sb.toString();
    }
}
