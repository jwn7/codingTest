/*
 * 날짜: 2026-08-04
 * 문제: 방문 길이
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/49994
 */
public class VisitLength {
    public int solution(String dirs) {
        int answer = 0;
        boolean[][][][] visited = new boolean[11][11][11][11];
        int currentX = 5;
        int currentY = 5;
        int prevX = 5;
        int prevY = 5;
        for(char c : dirs.toCharArray()) {
            if(c == 'U')
            {
                currentY++;
            }
            else if(c =='D')
            {
                currentY--;
            }
            else if(c == 'R')
            {
                currentX++;
            }
            else if(c == 'L')
            {
                currentX--;
            }
            if (currentX < 0 || currentX > 10 || currentY < 0 || currentY > 10) {
                currentX = prevX;
                currentY = prevY;
                continue;
            }
            if(!visited[prevX][prevY][currentX][currentY])  {
                visited[prevX][prevY][currentX][currentY] = true;
                visited[currentX][currentY][prevX][prevY] = true;
                answer++;
            }
            prevX = currentX;
            prevY = currentY;

        }
        return answer;
    }
}
