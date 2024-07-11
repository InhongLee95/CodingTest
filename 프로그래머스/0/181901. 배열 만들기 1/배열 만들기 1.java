import java.util.*;

class Solution {
    public int[] solution(int n, int k) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        
        for(int i = 1; i<=n; i++) {
            if (k * i <= n ) arr.add(k*i);
        }
        
        
        int[] answer = new int[arr.size()];
        
        for(int i = 0; i<answer.length; i++ ) {
            answer[i] = arr.get(i);
        }
        
        
        return answer;
    }
}