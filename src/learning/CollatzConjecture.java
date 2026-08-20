/*
 * 날짜: 2026-08-20
 * 문제: 콜라츠 추측
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/12943
 */
public class CollatzConjecture {
    public int solution(int num) {
        int count = 0;
        long current = num;
        if(current == 1)
            return 0;
        while(true) {
            if(current == 1)
                break;
            if(count == 500) {
                return -1;
            }
            if(current % 2 == 0) {
                current /= 2;
            }
            else {
                current = current * 3 + 1;
            }
            count++;
        }
        return count;
    }
}
