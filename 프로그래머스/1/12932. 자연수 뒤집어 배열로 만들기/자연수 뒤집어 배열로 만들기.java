class Solution {
    public int[] solution(long n) {
                
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder(s);
        
        sb = sb.reverse();
        
        String[] sarr = sb.toString().split("");
        
        int[] answer = new int[sarr.length];
        for (int i=0; i < sarr.length; i++ ) {
            answer[i] = Integer.parseInt(sarr[i]);
        }
        
        return answer;
        
        
    }
    
    
}