import java.util.HashMap;
import java.util.Map;
/*
 * 날짜: 2026-06-23
 * 문제: 완주하지 못한 선수
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/42576
 */
public class IncompleteRunner {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i<participant.length;i++)
        {
            if(map.containsKey(participant[i]))
            {
                map.put(participant[i], map.get(participant[i])+1);
            }
            else
                map.put(participant[i], 1);
        }
        for(int i = 0; i<completion.length;i++)
        {
            map.put(completion[i], map.get(completion[i])-1);
        }
        for(String name: map.keySet())
        {
            if(map.get(name) > 0)
            {
                answer = name;
                break;
            }
        }

        return answer;
    }
}
