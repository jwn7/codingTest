/*
 * 날짜: 2026-08-21
 * 문제: 최대공약수와 최소공배수
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/12940
 */
public class GcdAndLcm {
    public int[] solution(int n, int m) {

        int gcd1 = gcd(n,m);
        int lcm1 = n*m / gcd1;
        int[] result = new int[2];
        result[0] = gcd1;
        result[1] = lcm1;
        return result;
    }
    public int gcd(int a, int b) {
        if(b == 0)
            return a;
        else {
            return gcd(b, a % b);
        }
    }
}
