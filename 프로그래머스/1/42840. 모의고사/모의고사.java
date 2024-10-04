import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] score = {0,0,0};
        
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};
        int max = 0;
        
        for(int i = 0; i<answers.length; i++) {
            if(one[i%5] == answers[i]) score[0]++;
            if(two[i%8] == answers[i]) score[1]++;
            if(three[i%10] == answers[i]) score[2]++;
            
        }
        max = Math.max(score[0], Math.max(score[1], score[2]));
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<score.length; i++) {
            if(score[i] == max) {
                list.add(i+1);
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i< answer.length; i++) {
            answer[i] = list.get(i);
            
        }
        
        
        
        
        
        return answer;
    }
}