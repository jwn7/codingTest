/*
 * 날짜: 2026-07-06
 * 문제: 핸드폰 번호 가리기
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/12948
 */
public class MaskPhoneNumber {
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<phone_number.length();i++)
        {
            if(i < phone_number.length() - 4)
                sb.append("*");
            else
                sb.append(phone_number.charAt(i));
        }
        return sb.toString();
    }
}
