import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 2; i<n; i++) {
            int tmp = (int) Math.pow(i, 2);
            if(n == tmp) {
                answer = 1;
                break;
            }
            else {
                answer = 2;
            }
            
        }
        
        return answer;
    }
}