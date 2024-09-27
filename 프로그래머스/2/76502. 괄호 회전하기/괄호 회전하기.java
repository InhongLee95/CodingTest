import java.util.Stack;

public class Solution {
    static public int solution(String s) {
        int answer = 0;
        
        for(int j =0; j<s.length(); j++) {
            String tmp1 = s.substring(j, s.length());
            String tmp2 = s.substring(0, j);
            String tmp3 = tmp1 + tmp2;
        
            char[] arr = tmp3.toCharArray();
            Stack<Character> stack = new Stack<>();
        
                for(int i = 0; i<arr.length; i++) {
                    if(arr[i] == '(' || arr[i] == '{' || arr[i] == '[' ) {
                        stack.push(arr[i]);
                    }
                    else{
                        if(!stack.isEmpty()) { 
                            if(stack.peek() == '(' && arr[i] == ')') stack.pop();
                            else if(stack.peek() == '{' && arr[i] == '}') stack.pop();
                            else if(stack.peek() == '[' && arr[i] == ']') stack.pop();
                            else if(stack.isEmpty()) {
                                stack.push(arr[i]);
                            }    
                        }
                        else {
                            stack.push(arr[i]);
                        }
                    }
            
                }//inner - for
            if(stack.isEmpty()) {
                answer++;
            }
            
        }//for

        

        return answer;
    }
}