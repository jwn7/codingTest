/*
 * 날짜: 2026-09-15
 * 문제: 옹알이 (2)
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/133499
 */
public class BabblingTwo {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] sounds = {"aya", "ye", "woo", "ma"};

        for (String word : babbling) {
            int index = 0;
            String previous = "";

            while (index < word.length()) {
                if (word.startsWith(sounds[0], index)) {
                    if (previous.equals(sounds[0])) {
                        break;
                    }
                    previous = sounds[0];
                    index += sounds[0].length();
                } else if (word.startsWith(sounds[1], index)) {
                    if (previous.equals(sounds[1])) {
                        break;
                    }
                    previous = sounds[1];
                    index += sounds[1].length();
                } else if (word.startsWith(sounds[2], index)) {
                    if (previous.equals(sounds[2])) {
                        break;
                    }
                    previous = sounds[2];
                    index += sounds[2].length();
                } else if (word.startsWith(sounds[3], index)) {
                    if (previous.equals(sounds[3])) {
                        break;
                    }
                    previous = sounds[3];
                    index += sounds[3].length();
                } else {
                    break;
                }
            }

            if (index == word.length()) {
                answer++;
            }
        }
        return answer;
    }
}
