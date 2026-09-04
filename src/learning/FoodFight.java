/*
 * 날짜: 2026-09-03
 * 문제: 푸드 파이트 대회
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/134240
 */
public class FoodFight {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            if (food[i] % 2 != 0)
                food[i]--;
            if (food[i] == 0) {
                continue;
            }
            String t = String.valueOf(i).repeat(food[i] / 2);
            sb.append(t);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(sb);
        sb2.reverse();
        sb.append("0").append(sb2);
        return sb.toString();
    }
}
