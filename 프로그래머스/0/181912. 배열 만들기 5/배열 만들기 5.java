import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        
        ArrayList<Integer> arr = new ArrayList<>();
               
        
        //s부터 시작, l길이까지 문자열 대입
        for(String str : intStrs) {
            int j = Integer.parseInt(str.substring(s, s + l));
            
            // k보다 큰 값을 담은 배열 리턴
            if(j > k) arr.add(j);
            
        }
                 
        

        
        // answer 배열 초기화 및 값 대입        
        int[] answer = new int[arr.size()];
        
        // answer 대입    
        for(int i = 0; i<answer.length; i++) {
            answer[i] = arr.get(i);
        }
        
        return answer;
            
        }
        
        
}