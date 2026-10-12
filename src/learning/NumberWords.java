/*
 * 날짜: 2026-10-12
 * 문제: 숫자 문자열과 영단어
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/81301
 */
public class NumberWords {
    public int solution(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); ) {
            if (s.startsWith("zero", i)) {
                sb.append('0');
                i += 4;
            } else if (s.startsWith("one", i)) {
                i += 3;
                sb.append('1');
            } else if (s.startsWith("two", i)) {
                i += 3;
                sb.append('2');
            } else if (s.startsWith("three", i)) {
                i += 5;
                sb.append('3');
            } else if (s.startsWith("four", i)) {
                i += 4;
                sb.append('4');
            } else if (s.startsWith("five", i)) {
                i += 4;
                sb.append('5');
            } else if (s.startsWith("six", i)) {
                i += 3;
                sb.append('6');
            } else if (s.startsWith("seven", i)) {
                i += 5;
                sb.append('7');
            } else if (s.startsWith("eight", i)) {
                i += 5;
                sb.append('8');
            } else if (s.startsWith("nine", i)) {
                i += 4;
                sb.append('9');
            } else {
                sb.append(s.charAt(i));
                i++;
            }
        }
        return Integer.parseInt(sb.toString());
    }
}
