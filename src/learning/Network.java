import java.util.ArrayDeque;
import java.util.Queue;

/*
 * 날짜: 2026-07-28
 * 문제: 네트워크
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/43162
 */
public class Network {
    public int solution(int n, int[][] computers) {
        int network = 0;
        boolean visited[] = new boolean[n];
        Queue<Integer> queue = new ArrayDeque<>();
        for(int i = 0; i<n;i++)
        {
            if(!visited[i])
            {
                network++;
                queue.offer(i);
                visited[i] = true;
                while(!queue.isEmpty())
                {
                    int current = queue.poll();
                    for(int j = 0; j<n;j++)
                    {
                        if(computers[current][j] == 1 && !visited[j])
                        {
                            visited[j] = true;
                            queue.offer(j);
                        }
                    }
                }
            }
        }
        return network;
    }
}
