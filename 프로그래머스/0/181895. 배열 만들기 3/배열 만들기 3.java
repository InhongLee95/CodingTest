import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        
        for(int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];            
            
            for(int j = start; j<=end; j++) {
                list.add(arr[j]);
            }
        }//for
        
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        
        return answer;
    }
}
