/*
 * 날짜: 2026-09-18
 * 문제: 시저 암호
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/12926
 */
public class CaesarCipher {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            // 65 90, 97 122
            if (65 <= c && c <= 90) {
                int offset = c - 'A';
                offset = offset + n;
                if (offset >= 26) {
                    offset -= 26;
                }
                sb.append((char) (offset + 65));
                continue;
            }
            if (97 <= c && c <= 122) {
                int offset = c - 'a';
                offset = offset + n;
                if (offset >= 26) {
                    offset -= 26;
                }
                sb.append((char) (offset + 97));
                continue;
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
