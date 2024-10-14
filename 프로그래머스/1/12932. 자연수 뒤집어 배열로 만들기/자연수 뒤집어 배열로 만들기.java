import java.util.*;

class Solution {
    public int[] solution(long n) {
        
        String m  = String.valueOf(n);
        
        char[] arr = m.toCharArray();
        
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0; i<arr.length; i++) {
            list.add(arr[i]);
        }
        
        Collections.reverse(list);
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i<answer.length; i++) {
            answer[i] = list.get(i) - '0';
        }
        
        
        
        
        return answer;
    }
}