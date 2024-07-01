class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        
        while(n != 0) {
            sb.insert(0, n % 3);
            n = n / 3;  
        }
        sb.reverse();
        System.out.println(sb);
        
        String result = sb.toString();
        answer = Integer.parseInt(result, 3);
        return answer;
        
        
        
    }
}