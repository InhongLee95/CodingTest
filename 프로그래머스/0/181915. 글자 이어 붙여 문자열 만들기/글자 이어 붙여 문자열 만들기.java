class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        
        char[] temp = my_string.toCharArray();
        
        
        
        for(int i = 0; i<index_list.length; i++) {
            answer += temp[index_list[i]];
        }
        
        
        
        
        return answer;
    }
}