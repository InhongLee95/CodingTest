class Solution {
    public String solution(String myString) {
        String answer = "";
        StringBuilder sb = new StringBuilder("");
        
        for(int i = 0; i < myString.length(); i++) {         
            char ch = myString.charAt(i);
            
            if(Character.isLowerCase(ch)) {
                ch = Character.toUpperCase(ch);
            }
            sb.append(ch);
        }//for
        
        
        return sb.toString();
    }
}