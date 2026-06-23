import java.util.HashSet;
import java.util.Set;

/*
 * 날짜: 2026-06-24
 * 문제: 폰켓몬
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/1845
 */
public class Ponketmon {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums)
        {
            set.add(i);
        }
        return Math.min(set.size(), nums.length/2);
    }
}
