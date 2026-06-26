/*
 * 날짜: 2026-06-26
 * 문제: 서울에서 김서방 찾기
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/12919
 */
public class FindKim {
    public String solution(String[] seoul) {
        int d = 0;
        for(int i = 0; i<seoul.length; i++)
        {
            if(seoul[i].equals("Kim"))
            {
                d = i;
                break;
            }
        }
        String answer = "김서방은 ";
        answer += d;
        answer += "에 있다";
        return answer;
    }
}
