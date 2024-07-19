import java.util.*;

class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        List<String> list = new ArrayList<>();
        
        for(int i = 0; i < str_list.length; i++) {
            if(!str_list[i].contains(ex)) {
                list.add(str_list[i]);
            }
            
        }
        
        for(String a : list) {
            answer += a;
        }
        
        
        return answer;
    }
}