/*
 * 날짜: 2026-08-05
 * 문제: 최댓값과 최솟값
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/12939
 */
public class MaxMin {
    public String solution(String s) {
        String answer = "";
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(String c : s.split(" ")) {
            int target = Integer.parseInt(c);
            if(min > target)
                min = target;
            if(max < target)
                max = target;
        }
        return min + " " + max;
    }
}
