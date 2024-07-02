import java.util.*;

class Solution {
    public String solution(String s) {
        
        // 문자열을 -> 문자 단위로 변환
        String[] str = s.split("");      
        
        // 내림차순 정렬
        Arrays.sort(str, Collections.reverseOrder());
                

        // String 배열을 하나의 문자열로 변환
        String answer = String.join("", str);

        
        return answer;
    }
}