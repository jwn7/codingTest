/*
 * 날짜: 2026-07-17
 * 문제: 짝지어 제거하기
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/12973
 */
import java.util.ArrayDeque;
import java.util.Deque;

public class PairRemoval {
    public int solution(String s) {
        int answer = 0;
        Deque<Character> stack = new ArrayDeque<>();

        for(char c : s.toCharArray())
        {
            if(stack.isEmpty())
            {
                stack.push(c);
            }
            else
            {
                char tar = stack.peek();

                if(tar == c)
                {
                    stack.pop();
                }
                else
                {
                    stack.push(c);
                }
            }
        }

        if(stack.isEmpty())
            return 1;
        else
            return 0;
    }
}
