import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] first = {1,2,3,4,5};
        int[] second = {2,1,2,3,2,4,2,5};
        int[] third = {3,3,1,1,2,2,4,4,5,5};
        int[] score = {0,0,0};
        
        // 수포자들의 점수 계산
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == first[i%5])  score[0] ++;
            if(answers[i] == second[i%8]) score[1]++;
            if(answers[i] == third[i%10]) score[2]++;
            
        }
        
        // 최대 점수 구하기
        int max = Math.max(score[0], Math.max(score[1], score[2]));
        
        
        // 최대 점수를 가진 수포자_번호 리스트 생성
        List<Integer> student = new ArrayList<Integer>();
        for (int i = 0; i<score.length; i++) {
            if(max == score[i]) student.add(i+1);              
        }
        
        
        // 결과값 출력값에 맞게 담음
        int[] answer = new int[student.size()];
        for(int i=0; i<student.size(); i++) {
            answer[i] = student.get(i);
        }
        
        
        
        return answer;
    }
    
    
    
    
}