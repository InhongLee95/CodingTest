import java.util.*;

class Solution {
    public String solution(int[] numLog) {
                
        StringBuilder sb = new StringBuilder();
        
        
        for(int i = 0; i<numLog.length-1; i++) {
            if(numLog[i] + 1 == numLog[i+1] ) sb.append("w");
            if(numLog[i] - 1 == numLog[i+1] ) sb.append("s");
            if(numLog[i] + 10 == numLog[i+1] ) sb.append("d");
            if(numLog[i] - 10 == numLog[i+1] ) sb.append("a");
        
        }
        
        String answer = sb.toString();
        
        
        return answer;
    }
}
