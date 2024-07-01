import java.util.*;

class Solution {
    public String solution(String my_string) {        
        char[] ch = my_string.toCharArray();
        
        Set<Character> set  = new LinkedHashSet<>();
        
        for(int i = 0; i<ch.length; i++) {
            set.add(ch[i]);
        }
        
        StringBuilder answer = new StringBuilder();
        for(Character c: set) {
            answer.append(c);
        }
        
        
        
        
        return answer.toString();
    }
}