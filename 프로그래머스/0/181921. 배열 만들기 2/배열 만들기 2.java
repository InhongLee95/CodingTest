import java.util.*;


class Solution {
    public int[] solution(int l, int r) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i =l; i<=r; i++) {
            if(String.valueOf(i).matches("[05]+")) {
                arr.add(i);
            }
            
        }//for
        
        if(arr.isEmpty()) return new int[] {-1};
        
        
        int[] answer = new int[arr.size()];
        for(int i = 0; i<answer.length; i++) {
            answer[i] = arr.get(i);
        }
        
        
        
        return answer;
    }
}