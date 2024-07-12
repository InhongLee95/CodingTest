import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        
        ArrayList<String> list = new ArrayList<>();
        
        // 왼쪽 문자열 기준 l
        int index1 = -1;
        
        // 오른쪽 문자열 기준 r
        int index2 = -1;
        
        for(int i = 0; i<str_list.length; i++) {
            if(str_list[i].equals("l")) {
                index1 = i;
                break;
            }
            else if(str_list[i].equals("r")) {
                index2 = i;
                break;
            }
        }
        
        if(index1 > index2) {
            for(int i = 0; i<index1; i++ ) {
                list.add(str_list[i]);
            }
        }
        else if (index2 > index1) {
             for(int i = index2+1; i<str_list.length; i++ ) {
                list.add(str_list[i]);
            }
        }
        
        
        String[] answer = new String[list.size()];
        
        for(int i = 0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
    
        return answer;
    }
}