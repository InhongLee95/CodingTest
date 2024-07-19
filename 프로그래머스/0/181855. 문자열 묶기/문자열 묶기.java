import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        
        List<Integer> list = new ArrayList<>();
        
        
        for(int i = 0; i<strArr.length; i++) {
            if(!list.contains(strArr[i].length())) {
                list.add(strArr[i].length());
            }
        }//for
        
        int[] temp = new int[list.size()];
        for(int i=0;i<strArr.length;i++){
            temp[strArr[i].length()-1]++;
        }
        
        for(int k = 0; k < temp.length; k++) {
            if(answer < temp[k]) answer = temp[k];
        }
        
         
        return answer;
    }
}