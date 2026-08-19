/*
 * 날짜: 2026-08-19
 * 문제: 2016년
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/12901
 */
public class Year2016 {
    public String solution(int a, int b) {
        String[] day = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int m = 1;
        int d = 1;
        int idx = 5;
        while(m < a) {
            if(m == 1 || m == 3|| m == 5|| m == 7|| m == 8|| m == 10) {
                idx += 3;
            }
            else if( m == 2) {
                idx += 1;
            }
            else {
                idx += 2;
            }
            idx %= 7;
            m++;
        }
        while(d < b) {
            idx++;
            d++;
            idx %= 7;
        }
        return day[idx];
    }
}
