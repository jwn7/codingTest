import java.util.Arrays;

/*
 * 날짜: 2026-07-10
 * 문제: [PCCE 기출문제] 10번 / 데이터 분석
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/250121
 */
public class DataAnalysis {

    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] ans = new int[data.length][4];
        int idx1 = 0;
        int extIndex = 0;
        int sortIndex = 0;

        if (ext.equals("code")) extIndex = 0;
        else if (ext.equals("date")) extIndex = 1;
        else if (ext.equals("maximum")) extIndex = 2;
        else if (ext.equals("remain")) extIndex = 3;

        if (sort_by.equals("code")) sortIndex = 0;
        else if (sort_by.equals("date")) sortIndex = 1;
        else if (sort_by.equals("maximum")) sortIndex = 2;
        else if (sort_by.equals("remain")) sortIndex = 3;

        for (int i = 0; i < data.length; i++) {
            if (data[i][extIndex] < val_ext) {
                for (int j = 0; j < 4; j++) {
                    ans[idx1][j] = data[i][j];
                }
                idx1++;
            }
        }

        int[][] result = Arrays.copyOf(ans, idx1);
        final int sort = sortIndex;

        Arrays.sort(result, (a, b) -> {
            return Integer.compare(a[sort], b[sort]);
        });

        return result;
    }
}
