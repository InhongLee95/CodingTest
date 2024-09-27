import java.util.*;

class Solution {
    public String solution(String my_string) {        
        char[] ch = my_string.toCharArray();
        String answer = "";
        
        HashSet<Character> set = new LinkedHashSet<>();
        
        for(int i = 0; i<ch.length; i++) {
            set.add(ch[i]);
        }
        
        for(char a : set) {
            answer += a;
        }
        
        
        return answer;
    }
}