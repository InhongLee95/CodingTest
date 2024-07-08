import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        
        while(i<arr.length) {
            if(list.size() == 0) {
                list.add(arr[i]);
                i += 1;
            }
            else{
                int last = list.get(list.size()-1);
                if(list.size() != 0 && last < arr[i]) {
                    list.add(arr[i]);
                    i += 1;
                }else if (list.size() != 0 && last >= arr[i]) {
                    list.remove(list.size()-1);
                }
            }

        }//while
        
        
        int[] answer = new int[list.size()];
        for(int j = 0; j < answer.length; j++) {
            answer[j] = list.get(j);
        }
        
        
        
        return answer;
    }
}