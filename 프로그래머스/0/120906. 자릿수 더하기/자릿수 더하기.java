import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);
        ArrayList<Integer> list = new ArrayList<>();
        
        
        for(int i = 0; i<str.length(); i++) {
            char a = str.charAt(i);
            int b = a - '0';
            list.add(b);
            
        }
        
        for(int c : list) {
            answer += c;
        }
        
        
        return answer;
    }
}