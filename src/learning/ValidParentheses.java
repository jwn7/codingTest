/*
 * 날짜: 2026-07-16
 * 문제: 올바른 괄호
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/12909
 */
import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
    public boolean solution(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for(char i : s.toCharArray())
        {
            if(stack.isEmpty())
            {
                if(i == '(')
                    stack.push(i);
                else
                    return false;
            }
            else if(i == '(')
                stack.push(i);
            else if(i == ')')
            {
                stack.pop();
            }
        }

        if(stack.isEmpty())
            return true;
        else
            return false;
    }
}
