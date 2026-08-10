/*
 * 날짜: 2026-08-10
 * 문제: 햄버거 만들기
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/133502
 */
import java.util.ArrayList;
import java.util.List;

public class BurgerMaking {
    public int solution(int[] ingredient) {
        int answer = 0;
        List<Integer> stack = new ArrayList<>();
        List<Integer> burger = List.of(1, 2, 3, 1);

        for (int i : ingredient) {
            stack.add(i);

            if (stack.size() >= 4) {
                int size = stack.size();
                List<Integer> lastFour = stack.subList(size - 4, size);

                if (lastFour.equals(burger)) {
                    lastFour.clear();
                    answer++;
                }
            }
        }
        return answer;
    }
}
