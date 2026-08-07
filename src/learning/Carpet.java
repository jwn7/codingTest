/*
 * 날짜: 2026-08-07
 * 문제: 카펫
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/42842
 */
public class Carpet {
    public int[] solution(int brown, int yellow) {
        int area = brown + yellow;
        int[][] list = new int[area][2];
        int idx = 0;
        for(int i = 3; i<area;i++) {
            if(area % i  == 0)
            {
                int j = area / i;
                if (i < j || j < 3)
                    continue;
                list[idx][0] = i;
                list[idx][1] = j;
                idx++;
            }
        }
        int[] t = new int[2];
        for (int i = 0; i<idx;i++) {
            int x = list[i][0];
            int y = list[i][1];
            int check = x + y - 1 + x - 1 + y - 2;
            if(check == brown)
            {
                t[0] = x;
                t[1] = y;
                break;
            }
        }
        return t;
    }
}
