import java.util.*; 

class Solution {
    public int[] solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i< my_string.length(); i++) {
            if(my_string.charAt(i) == '0' ||
                my_string.charAt(i) == '1' ||
               my_string.charAt(i) == '2' ||
               my_string.charAt(i) == '3' ||
               my_string.charAt(i) == '4' ||
               my_string.charAt(i) == '5' ||
               my_string.charAt(i) == '6' ||
               my_string.charAt(i) == '7' ||
               my_string.charAt(i) == '8' ||
               my_string.charAt(i) == '9'
              ) sb.append(my_string.charAt(i));
            
        }
        
        char[] arr = sb.toString().toCharArray();
        Arrays.sort(arr);
        
        int[] answer = new int[arr.length];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = arr[i] - '0';  
        }
        
        
        
        return answer;
    }
}