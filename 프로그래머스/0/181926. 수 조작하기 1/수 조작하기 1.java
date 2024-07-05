import java.util.*;

class Solution {
    public int solution(int n, String control) {
        int answer = n;
        
        
        for(int i = 0; i <control.length(); i++) {
            char input = control.charAt(i);
            
            if(input == 'w') answer += 1;
            if(input == 's') answer -= 1;
            if(input == 'd') answer += 10;
            if(input == 'a') answer -= 10;
            
        }
        
        
        return answer;
    }
}