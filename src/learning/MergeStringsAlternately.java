/*
 * 날짜: 2026-10-15
 * 문제: LeetCode 1768. Merge Strings Alternately
 * URL: https://leetcode.com/problems/merge-strings-alternately/
 */
public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int len1 = word1.length();
        int len2 = word2.length();

        int i;
        for(i = 0; i< Math.min(len1,len2);i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        sb.append(word1.substring(i));
        sb.append(word2.substring(i));
        return sb.toString();
    }
}
