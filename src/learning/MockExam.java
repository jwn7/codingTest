import java.util.ArrayList;

/*
 * 날짜: 2026-07-30
 * 문제: 모의고사
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/42840
 */
public class MockExam {
    public int[] solution(int[] answers) {
        int[] num1 = {1, 2, 3, 4, 5};
        int[] num2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] num3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for(int i = 0; i<answers.length;i++)
        {
            if(num1[i % num1.length] == answers[i])
            {
                count1++;
            }
            if(num2[i % num2.length] == answers[i]) {
                count2++;
            }
            if (num3[i % num3.length] == answers[i]) {
                count3++;
            }
        }
        ArrayList<Integer> l = new ArrayList<>();
        int t = Math.max(count1,count2);
        int max = Math.max(count3,t);
        if(max == count1 ) {
            l.add(1);
        }
        if(max == count2 ) {
            l.add(2);
        }
        if(max == count3 ) {
            l.add(3);
        }

        return l.stream().mapToInt(i -> i).toArray();
    }
}
