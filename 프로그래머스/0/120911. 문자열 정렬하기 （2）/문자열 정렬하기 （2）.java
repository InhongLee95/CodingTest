import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] arr = new char[my_string.length()];
        
        for(int i =0; i< my_string.length(); i++) {
            char tmp = my_string.charAt(i);
            if(Character.isUpperCase(tmp)) {
                arr[i] = Character.toLowerCase(tmp);
            }
            else {
                arr[i] = my_string.charAt(i);
            }
            
            
            
        }
        Arrays.sort(arr);
        
        return new String(arr);
    }
}