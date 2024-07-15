class Solution {
    public int solution(String myString, String pat) {
    
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < myString.length(); i++) {
            char ch = myString.charAt(i);
            if (ch == 'A') {
                sb.append('B');
            } else if (ch == 'B') {
                sb.append('A');
            } 
        }//for
        
        String temp = sb.toString();
        
        if(temp.contains(pat)) return 1;
        else return 0;

    }
}