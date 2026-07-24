/*
 * 날짜: 2026-07-24
 * 문제: 카드 뭉치
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/159994
 */
public class CardBundle {
    public String solution(String[] cards1, String[] cards2, String[] goal) {

        int idx1 = 0;
        int idx2 = 0;

        for (String s : goal) {
            if (idx1 < cards1.length && s.equals(cards1[idx1])) {
                idx1++;
                continue;
            } else if (idx2 < cards2.length && s.equals(cards2[idx2])) {
                idx2++;
                continue;
            } else {
                return "No";
            }
        }
        return "Yes";
    }
}
