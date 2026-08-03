/*
 * 날짜: 2026-08-03
 * 문제: 부족한 금액 계산하기
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/82612
 */
public class InsufficientAmount {
    public long solution(int price, int money, int count) {
        long total = 0;
        for(int i = 1; i<=count;i++) {
            total += i*price;
        }
        if(total < money) {
            return 0;
        }
        else {
            return total - money;
        }
    }
}
