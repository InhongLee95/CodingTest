import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] score = {0,0,0};
        
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        
        // 점수 체크
        for(int i = 0; i< answers.length; i++) {
            if(answers[i] == one[i%5]) score[0]++;
            if(answers[i] == two[i%8]) score[1]++;
            if(answers[i] == three[i%10]) score[2]++;            
        }
        
        
        // 최고 점수 값 
        int max = Math.max(score[0], Math.max(score[1], score[2]));
        
        // 최고 점수자 선별
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i< score.length; i++) {
            if(max == score[i]) list.add(i+1);
        }
        
        
        // 최다 점수획득자가 2명이상일 경우 수험자 번호 오름차순으로 정렬
        Collections.sort(list);
        
        //최고 점수획득자 타입변환
        int[] answer = new int[list.size()];
        
        for(int i = 0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        
        
        
        
        
        
        return answer;
    }
}