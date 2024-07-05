import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < num_list.length; i++) {
            answer.add(num_list[i]);
            if (i == num_list.length -1) {
                if (num_list[i-1] < num_list[i]) {
                    answer.add(answer.get(i) - answer.get(i-1));
                } else {
                    answer.add(num_list[i] * 2);
                }
            }
        } // for

        // ArrayList를 int 배열로 변환
        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }

        return result;
    }
}
