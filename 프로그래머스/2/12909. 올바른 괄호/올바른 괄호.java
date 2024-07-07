import java.util.Stack;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        char[] input = s.toCharArray();
        
        for(char item : input) {
            if(item == '('){
                stack.push('(');
            } else {
                // ) 인 경우 스택에 ( 가 있는 지 체크한다.
                if(!stack.isEmpty()) {
                    stack.pop();
                } else {
                    // 만약 ( 가 없으면 짝 문제  or )( 경우가 false 반환
                    return false;
                }
            }
        }
        
        // stack에 만약 ( 가 남아있다면 false
        if(!stack.isEmpty()) {
            return false;
        }
        
        return true;
    }
}
