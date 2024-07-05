import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        
        for(int i = 0; i<arr.length; i++) {
            answer[i] = arr[i];
        }
        
        for(int i = 0; i < queries.length; i++) {
            int j = queries[i][0];
            int k = queries[i][1];
            
            int tempJ = answer[j];
            int tempK = answer[k];
            
            answer[j] = tempK;
            answer[k] = tempJ;
            
            System.out.println(answer[j]);
            System.out.println(answer[k]);
            System.out.println();
                        
        }
        
        
        
        return answer;
    }
}