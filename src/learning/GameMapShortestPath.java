import java.util.Queue;
import java.util.ArrayDeque;

/*
 * 날짜: 2026-07-23
 * 문제: 게임 맵 최단거리
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/1844
 */
public class GameMapShortestPath {
    public int solution(int[][] maps) {
        int answer = 0;
        Queue<int[]> queue = new ArrayDeque<>();
        int[][] distance = new int[maps.length][maps[0].length];
        queue.offer(new int[] {0, 0});
        int[] dr = {-1,1,0,0};
        int[] dc = {0,0,-1,1};
        distance[0][0] = 1;
        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0];
            int col = current[1];
            for(int i = 0; i<4;i++)
            {
                int nextRow = row + dr[i];
                int nextCol = col + dc[i];
                if(nextRow<0 ||
                        nextCol<0 ||
                        nextRow >= maps.length ||
                        nextCol >= maps[0].length)
                    continue;
                if(distance[nextRow][nextCol] != 0)
                    continue;
                if(maps[nextRow][nextCol] == 1)
                {
                    queue.offer(new int[] {nextRow,nextCol});
                    distance[nextRow][nextCol] = distance[row][col] + 1;
                }
            }
        }
        while(distance[maps.length-1][maps[0].length-1] == 0)
            return -1;
        return distance[maps.length - 1][maps[0].length - 1];
    }
}
