import java.util.*;

public class NoConsecutiveDuplicates {
    public int[] solution(int []arr) {
        int[] answer = new int[arr.length];
        int idx = 0;
        int j;
        for(int i = 0; i<arr.length;i = j)
        {
            int num = arr[i];
            for(j = i+1; j<arr.length;j++)
            {
                if(num != arr[j])
                {
                    answer[idx++] = num;
                    break;
                }
            }
        }
        answer[idx++] = arr[arr.length-1];
        return Arrays.copyOf(answer, idx);
    }
}
