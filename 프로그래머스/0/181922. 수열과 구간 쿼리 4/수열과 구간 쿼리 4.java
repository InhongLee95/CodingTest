import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        
        for(int i = 0; i<queries.length; i++) {
           int s = queries[i][0];
           int e = queries[i][1];
            int k = queries[i][2]; // 올바르게 k를 설정
            
            for(int j = s; j<=e; j++) {
                if(j % k == 0) arr[j] +=1;
            }
            
        }//for
        
        
        int[] answer = Arrays.copyOf(arr, arr.length);
        
        return answer;
    }
}
