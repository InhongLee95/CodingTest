import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {0,0,0};
        
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};
        
        for(int i = 0; i<answers.length; i++) {
            if(answers[i] == one[i % 5]) answer[0]++;
            if(answers[i] == two[i % 8]) answer[1]++;
            if(answers[i] == three[i % 10]) answer[2]++;
            
        }
        
        int max = Math.max(answer[0], Math.max(answer[1], answer[2]));
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<answer.length; i++) {
            if(answer[i] == max)  list.add(i+1);
        }
        
        Collections.sort(list);
        
        int[] count = new int[list.size()];
        for(int i = 0; i<count.length; i++) {
            count[i] = list.get(i);
        }
        
        return count;
    }
} 