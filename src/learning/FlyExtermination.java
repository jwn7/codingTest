import java.util.Scanner;
import java.io.FileInputStream;

/*
 * 날짜: 2026-07-22
 * 문제: SWEA 2001 - 파리 퇴치
 * URL: https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5PzOCKAigDFAUq
 */
public class FlyExtermination
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] files = new int[n][n];
            int result = -1;
            for(int i = 0; i<n;i++) {
                for(int j = 0; j<n;j++) {
                    files[i][j] = sc.nextInt();
                }
            }

            for(int i = 0; i<=n - m; i++) {
                for(int j = 0; j<=n - m; j++) {
                    int temp = 0;
                    for(int x = 0; x<m;x++) {
                        for(int y = 0; y<m;y++) {
                            temp += files[i + x][j + y];
                        }
                    }
                    if(temp > result) result = temp;
                }
            }

            System.out.println("#" + test_case + " " + result);

        }
        sc.close();

    }
}
