class Solution {
    public String solution(String n_str) {
        
        if(n_str.charAt(0) == '0') {
            for(int j = 1; j < n_str.length(); j++) {
                if(n_str.charAt(j) != '0') {
                    n_str = n_str.substring(j, n_str.length());
                    break;
                }
            }
        }
        
        
        
        return n_str;
    }
}