class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String sa = Integer.toString(a);
        String sb = Integer.toString(b);
        String sum = sa + sb;
        
        int sum1 = Integer.parseInt(sum);
        
        if(sum1 < 2 * a * b) return 2 * a * b;
        else return sum1;
    
        
    }
}