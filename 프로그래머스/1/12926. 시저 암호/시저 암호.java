class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i = 0; i<s.length(); i++) {
            char ch = s.charAt(i);
            
            if(Character.isLowerCase(ch)) {
                ch = (char) ((ch + n - 'a') % 26 + 'a');
            }
            else if(Character.isUpperCase(ch)) {
                ch = (char) ((ch + n - 'A') % 26 + 'A');
            }
            
            answer += ch;
        }
          
        
        return answer;    
    }      
}