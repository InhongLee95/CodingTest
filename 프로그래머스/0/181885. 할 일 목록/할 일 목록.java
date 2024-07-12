import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int[] check = new int[finished.length];
        ArrayList<String> list = new ArrayList<>();
        
        
        
        //체크
        for(int i = 0; i<finished.length; i++) {
            if(!finished[i]) check[i] = 1;
        }
        
        for(int i = 0; i<check.length; i++) {
            if(check[i] == 1) list.add(todo_list[i]);
        }
        
        
        String[] answer = list.toArray(new String[list.size()]);
        
        
        return answer;
    }
}