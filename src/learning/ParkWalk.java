/*
 * 날짜: 2026-08-12
 * 문제: 공원 산책
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/172928
 */
public class ParkWalk {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int x = -1;
        int y = -1;
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[0].length(); j++) {

                if (park[i].charAt(j) == 'S') {
                    x = j;
                    y = i;
                    break;
                }
            }
        }
        System.out.println("y = " + y + " x = " + x);
        for (String s : routes) {
            String[] row = s.split(" ");
            char c = row[0].charAt(0);
            int p = row[1].charAt(0) - '0';
            boolean can = true;
            if (c == 'S') {
                for (int i = 1; i <= p; i++) {
                    if ((y + i) >= park.length || park[y + i].charAt(x) == 'X') {
                        can = false;
                        break;

                    }
                }
                if (can) {
                    y += p;
                }
            } else if (c == 'N') {
                for (int i = 1; i <= p; i++) {
                    if ((y - i) < 0 || park[y - i].charAt(x) == 'X') {
                        can = false;
                        break;

                    }
                }
                if (can) {
                    y -= p;
                }
            } else if (c == 'E') {
                for (int i = 1; i <= p; i++) {
                    if ((x + i) >= park[0].length() || park[y].charAt(x + i) == 'X') {
                        can = false;
                        break;

                    }
                }
                if (can) {
                    x += p;
                }
            } else if (c == 'W') {
                for (int i = 1; i <= p; i++) {
                    if ((x - i) < 0 || park[y].charAt(x - i) == 'X') {
                        can = false;
                        break;

                    }
                }
                if (can) {
                    x -= p;
                }
            }
        }
        answer[0] = y;
        answer[1] = x;
        return answer;
    }
}
