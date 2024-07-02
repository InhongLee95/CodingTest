import java.util.*;

class Solution {
    
    final char[] WORDS = {'A', 'E', 'I', 'O', 'U'};
    final int MAX_LENGTH = 5;
        
    public int solution(String word) {
    
    
        int answer = 0;
        List<String> elements = new ArrayList<>();
        
        
        // dfs 호출 
        for(int i=0; i<WORDS.length; i++){
            dfs(elements, String.valueOf(WORDS[i]));
        }    
        
        
         // dfs 동작 완료후 List에 저장된 수만큼 반복문 돌려서
         // word와 동일한 문자열이 -> List에 저장된 n번째 수가 동일한 문자열 만들어진 횟수
        for(int i=0; i<elements.size(); i++){
            if(elements.get(i).equals(word)){
                answer = i + 1;
                break;
            }
        }
        
        return answer;
    }
    
    
    void dfs(List<String> elements, String str){
		    // str.length가 6이되면 리턴
        if(str.length() > MAX_LENGTH) return;
				
				
				// List에 str 값이 포함x -> List.add         
        if(!elements.contains(str)) elements.add(str);
    
        for(int i=0; i<WORDS.length; i++){

        // 중요! dfs(elements, str+WORDS[i]);
        // dfs 재 호출할 때 str+ WORD를 더해서 재호출한다.
        // 그러므로 처음에 AA를 다시 dfs에 strdp 넣고, 이 후 AA+WORD = AAA가 된다.
        // 즉 문자수가 6이 넘어가면 위 if문에 걸려서 그냥 리턴하게된다.   
            dfs(elements, str+WORDS[i]);
        }
    }
}