/*
 * 날짜: 2026-10-17
 * 문제: LeetCode 389. Find the Difference
 * URL: https://leetcode.com/problems/find-the-difference/
 * 로직 힌트 후 해결
 */
public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        int r = 0;
        for(char c : s.toCharArray()) {
            r += c;
        }
        for(char c : t.toCharArray()) {
            r -= c;
        }
        return (char) Math.abs(r);
    }
}
