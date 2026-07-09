import java.util.Arrays;
/*
 * 날짜: 2026-07-09
 * 문제: 문자열 내 마음대로 정렬하기
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/12915
 */
public class SortStringsByIndex {

    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (a, b) -> {
            char a1 = a.charAt(n);
            char b1 = b.charAt(n);

            if (a1 != b1)
                return Character.compare(a1, b1);

            return a.compareTo(b);
        });

        return strings;
    }
}
