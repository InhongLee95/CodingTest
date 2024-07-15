import java.util.*;

class Solution {
    public String[] solution(String myString) {
        
        String[] temp = myString.split("x+");
        ArrayList<String> list = new ArrayList<>();
        
        for(int i = 0; i<temp.length; i++) {
            if(!temp[i].isEmpty()) list.add(temp[i]);
        }
        
        
        String[] answer = list.toArray(new String[list.size()]);
        Arrays.sort(answer);
          
        
        return answer;
    }
}