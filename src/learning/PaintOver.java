/*
 * 날짜: 2026-08-24
 * 문제: 덧칠하기
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/161989
 */
public class PaintOver {
    public int solution(int n, int m, int[] section) {
        boolean[] wall = new boolean[n];
        for(int i : section) {
            wall[i-1] = true;
        }
        int result = 0;
        int current = 0;
        int idx = 0;
        boolean check = false;
        while(idx < wall.length) {
            if(wall[idx]) {
                check = true;
            }
            if(check) {
                current++;
            }
            if(current == m) {
                result++;
                current = 0;
                check = false;
            }
            idx++;
        }
        if(current != 0) {
            result++;
        }
        return result;
    }
}
