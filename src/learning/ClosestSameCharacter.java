/*
 * 날짜: 2026-10-09
 * 문제: 가장 가까운 같은 글자
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/142086
 */
public class ClosestSameCharacter {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int[] alpha = new int[26];
        for (int i = 0; i < 26; i++) {
            alpha[i] = -1;
        }
        for (int i = 0; i < s.length(); i++) {
            if (alpha[s.charAt(i) - 'a'] == -1) {
                answer[i] = -1;
            } else {
                answer[i] = i - alpha[s.charAt(i) - 'a'];
            }
            alpha[s.charAt(i) - 'a'] = i;
        }
        return answer;
    }
}
