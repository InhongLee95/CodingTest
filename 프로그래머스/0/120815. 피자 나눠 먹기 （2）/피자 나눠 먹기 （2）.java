class Solution {
    public int solution(int n) {
        int answer = 0;
        int i = 6;
        
        //6조각 n 사람 수 남기지 않는 최소 판수
        while(true) {
            answer++;
            if(i % n == 0) {
                break;
            }
            i += 6;
            
        }
        
        
        
        
        return answer;
    }
}