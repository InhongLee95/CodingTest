class Solution {
    public int solution(int order) {
        int answer = 0;
        String count = String.valueOf(order);
        
        for(int i = 0; i<count.length(); i++) {
            char tmp = count.charAt(i);
            if(tmp == '3' || tmp == '6' || tmp == '9') answer++;
        }
        
        return answer;
    }
}