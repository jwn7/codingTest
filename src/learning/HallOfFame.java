/*
 * 날짜: 2026-09-04
 * 문제: 명예의 전당 (1)
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/138477
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class HallOfFame {
    public int[] solution(int k, int[] score) {

        List<Integer> h = new ArrayList<>();
        List<Integer> p = new ArrayList<>();

        for(int i = 0; i<score.length;i++) {
            if(i <= k - 1) {
                h.add(score[i]);
                h.sort(Comparator.reverseOrder());
                p.add(h.get(i));
            }
            else {
                int min = h.get(k-1);
                if(min < score[i]) {
                    h.set(k-1, score[i]);
                    h.sort(Comparator.reverseOrder());
                }
                p.add(h.get(k-1));
            }
        }
        return p.stream().mapToInt(i -> i).toArray();
    }
}
