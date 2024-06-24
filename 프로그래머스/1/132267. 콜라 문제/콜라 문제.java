class Solution {
    public int solution(int a, int b, int n) {
        
        int answer =  recursion(a, b, n, 0);
    
        return answer;           
    }
    
    public int recursion(int a, int b, int n, int answer) {
                   
        if(a <= n) {
            n = n - a;
            answer = answer+ b;
            n += b;
            
                
          return recursion(a, b, n, answer);       
        } else  {
            return answer;
        
    }
    }
    
    
}