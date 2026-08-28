/*
 * 날짜: 2026-08-28
 * 문제: 과일 장수
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/135808
 */
import java.util.Arrays;
import java.util.Collections;

public class FruitMerchant {
    public int solution(int k, int m, int[] score) {
        Integer[] arr = new Integer[score.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = score[i];
        }
        Arrays.sort(arr, Collections.reverseOrder());
        int s = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == m - 1) {
                s += arr[i] * m;
                count = 0;
            } else {
                count++;
            }
        }
        return s;
    }
}
