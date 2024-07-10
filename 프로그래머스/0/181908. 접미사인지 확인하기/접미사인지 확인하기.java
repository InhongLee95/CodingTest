import java.util.*;

class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        String[] str = new String[my_string.length()];
        
        
        // 접미사 배열 생성
        for(int i = 0; i <str.length; i++ ) {
            str[i] = my_string.substring(i);
            
        }
        
        
        // 접미사 유무 체크
        for(int i = 0; i<str.length; i ++ ) {
            if(str[i].equals(is_suffix)) {
                answer = 1;
                break;
            }
            
        }
        
        
        
        
        
        return answer;
    }
}