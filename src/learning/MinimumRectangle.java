/*
 * 날짜: 2026-07-31
 * 문제: 최소직사각형
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/86491
 */
public class MinimumRectangle {
    public int solution(int[][] sizes) {
        int answer = 0;

        int rMax = -1;
        int lMax = -1;
        for(int i = 0; i<sizes.length;i++) {
            if(sizes[i][0] >= lMax)
            {
                lMax = sizes[i][0];
            }
            if(sizes[i][1] >= rMax)
            {
                rMax = sizes[i][1];
            }
        }
        boolean rl = (rMax > lMax) ? true : false;
        int find = -1;
        if(rl) {
            for(int i = 0; i<sizes.length;i++) {

                if (sizes[i][0] > sizes[i][1])
                {
                    int temp = sizes[i][0];
                    sizes[i][0] = sizes[i][1];
                    sizes[i][1] = temp;
                }
                if (find < sizes[i][0])
                    find = sizes[i][0];
            }
            return find * rMax;
        }
        else {
            for(int i = 0; i<sizes.length;i++) {

                if (sizes[i][0] < sizes[i][1])
                {
                    int temp = sizes[i][0];
                    sizes[i][0] = sizes[i][1];
                    sizes[i][1] = temp;
                }
                if(find < sizes[i][1])
                    find = sizes[i][1];

            }
            return find * lMax;
        }
    }
}
