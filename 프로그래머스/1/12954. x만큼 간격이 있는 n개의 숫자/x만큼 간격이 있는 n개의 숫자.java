class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        long tmpX = 0;
        
        
        for(int i = 0; i<n; i++) {
            tmpX += x;
            answer[i] = tmpX;
            
        }
        
        
        
        return answer;
    }
}