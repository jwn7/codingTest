/*
 * 날짜: 2026-07-21
 * 문제: 바탕화면 정리
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/161990
 */
public class DesktopCleanup {
    public int[] solution(String[] wallpaper) {
        int[] answer = {0,0,0,0};
        int x1 = Integer.MAX_VALUE;
        int y1 = Integer.MAX_VALUE;
        int x2 = Integer.MIN_VALUE;
        int y2 = Integer.MIN_VALUE;
        for(int i = 0; i<wallpaper.length;i++)
        {
            for(int j = 0; j<wallpaper[i].length();j++)
            {
                if(wallpaper[i].charAt(j) == '#')
                {
                    if(i < x1)
                        x1 = i;
                    if(i > x2)
                        x2 = i;
                    if(j < y1)
                        y1 = j;
                    if(j > y2)
                        y2 = j;
                }
            }
        }
        answer[0] = x1;
        answer[1] = y1;
        answer[2] = x2+1;
        answer[3] = y2+1;
        return answer;
    }
}
