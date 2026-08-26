/*
 * 날짜: 2026-08-26
 * 문제: 로또의 최고 순위와 최저 순위
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/77484
 */
public class LottoRank {
    public int[] solution(int[] lottos, int[] win_nums) {

        int zero = 0;
        int match = 0;
        for (int i : lottos) {
            if (i == 0) {
                zero++;
                continue;
            }
            for (int j : win_nums) {
                if (i == j) {
                    match++;
                    break;
                }
            }
        }
        int min = match;
        int max = match + zero;
        int[] result = new int[2];
        switch (max) {
            case 2 -> result[0] = 5;
            case 3 -> result[0] = 4;
            case 4 -> result[0] = 3;
            case 5 -> result[0] = 2;
            case 6 -> result[0] = 1;
            default -> result[0] = 6;
        }
        switch (min) {
            case 2 -> result[1] = 5;
            case 3 -> result[1] = 4;
            case 4 -> result[1] = 3;
            case 5 -> result[1] = 2;
            case 6 -> result[1] = 1;
            default -> result[1] = 6;
        }
        return result;
    }
}
