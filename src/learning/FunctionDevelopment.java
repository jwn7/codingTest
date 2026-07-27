import java.util.ArrayList;

/*
 * 날짜: 2026-07-27
 * 문제: 기능개발
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/42586
 */
public class FunctionDevelopment {
    public int[] solution(int[] progresses, int[] speeds) {
        int seq = 0;
        ArrayList<Integer> list = new ArrayList<>();

        while (seq < progresses.length) {
            int count = 0;

            for (int i = seq; i < progresses.length; i++) {
                progresses[i] += speeds[i];
            }

            while (seq < progresses.length && progresses[seq] >= 100) {
                count++;
                seq++;
            }

            if (count > 0) {
                list.add(count);
            }
        }

        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
