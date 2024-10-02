import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Map<String, Integer> hm = new HashMap<>();

        
        // 참여자  횟수 증가
        for(String p : participant) {
            hm.put(p, hm.getOrDefault(p, 0) +1);
        }
        
        // 완주자 횟수만큼 감소
        for(String c : completion) {
            hm.put(c, hm.get(c) - 1);
        }
        
        // 참여자 - 완주자 = 0이어야 한다.
        for (String key : hm.keySet()) {
            if (hm.get(key) != 0) {
                answer = key;
                break;
            }
        }

        
        return answer;
    }
}