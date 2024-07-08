import java.util.*;

class Solution {
    public int[] solution(int start_num, int end_num) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        int start = start_num;
        int end = end_num;
        
        
        for(int i = start_num; i<=end_num; i++) {
            if(i >= start  && i<= end ) arr.add(i);
        }
        
        
        int[] answer = new int[arr.size()];
        
        for(int i = 0; i<answer.length; i++ ) {
            answer[i] = arr.get(i);
        }
        
        
        return answer;
    }
}