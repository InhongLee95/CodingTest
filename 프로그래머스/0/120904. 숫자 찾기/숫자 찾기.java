class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String str = String.valueOf(num);
        String check = String.valueOf(k);
        char check1 = check.charAt(0);
        
        for(int i= 0; i<str.length(); i++) {
            char tmp = str.charAt(i);
            if(tmp == check1) {
                answer = i+1;
                break;
            }
        }
        
        
        return answer;
    }
}