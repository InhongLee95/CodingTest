class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        int drink = k;
        int rice = n * 12000;
        if(n / 10 > 0 ) {
            drink -= n/10;
        }
        
        drink *= 2000;
        
        
        answer = drink + rice;
        
        
        
        return answer;
    }
}