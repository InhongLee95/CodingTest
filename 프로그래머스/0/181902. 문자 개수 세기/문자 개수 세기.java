class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        
        for(int i = 0; i < my_string.length(); i++) {
            int input = my_string.charAt(i);    
            
            
            if(input >='A' && input <= 'Z') {
                answer[input - 'A']++;
            } else if (input >='a' && input <='z') {
                answer[26 + input -'a']++;
            }
            
            
        }//for
        
        return answer;
    }
}