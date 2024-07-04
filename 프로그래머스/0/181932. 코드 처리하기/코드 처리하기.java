class Solution {
    public String solution(String code) {
        
        
        StringBuilder sb = new StringBuilder();
        int mode = 0;
        
        for(int i = 0; i<code.length(); i++) {
            System.out.println(mode);
            
            if(mode == 0) {
                if(code.charAt(i) != '1') {
                    if(i % 2 == 0) {
                        sb.append(code.charAt(i));
                        
                    }
                }else {
                    mode = 1;
                    continue;
                }    
            }  // mode =0
            if(mode == 1) {
                if(code.charAt(i) != '1') {
                    if(i % 2 == 1) {
                        sb.append(code.charAt(i));
                    }
                }else {
                    mode = 0;
                    continue;
                    }
                }
        } // for
        
        if(sb.length() == 0) return "EMPTY";
        else {
            String answer = sb.toString();
            return answer;
        }
    }
}