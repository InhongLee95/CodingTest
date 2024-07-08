import java.util.*;

class Solution {
    public int solution(String number) {
        int answer = 0;
        
        String[] num = number.split("");
        
        for(int i = 0; i<num.length; i++) {
            answer += Integer.parseInt(num[i]);
            
        }
        
        answer %= 9;
        
        
        return answer;
    }
}