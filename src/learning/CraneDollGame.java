import java.util.ArrayDeque;
import java.util.Deque;

/*
 * 날짜: 2026-07-20
 * 문제: 크레인 인형뽑기 게임
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/64061
 */
public class CraneDollGame {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        for (int x : moves)
        {
            for (int y = 0; y < board.length; y++)
            {
                if (board[y][x - 1] == 0)
                    continue;
                else
                {
                    if (stack.isEmpty())
                    {
                        stack.push(board[y][x - 1]);
                        board[y][x - 1] = 0;
                    }
                    else
                    {
                        if (board[y][x - 1] == stack.peek())
                        {
                            stack.pop();
                            answer += 2;
                            board[y][x - 1] = 0;
                        }
                        else
                            stack.push(board[y][x - 1]);
                        board[y][x - 1] = 0;
                    }

                    break;
                }
            }
        }
        return answer;
    }
}
