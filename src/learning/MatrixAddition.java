/*
 * 날짜: 2026-08-22
 * 문제: 행렬의 덧셈
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/12950
 */
public class MatrixAddition {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        for(int i = 0; i<arr1.length;i++) {
            for(int j = 0; j<arr1[0].length;j++) {
                arr1[i][j] += arr2[i][j];
            }
        }
        return arr1;
    }
}
