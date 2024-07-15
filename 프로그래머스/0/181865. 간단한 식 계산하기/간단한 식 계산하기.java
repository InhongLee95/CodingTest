class Solution {
    public int solution(String binomial) {
        int answer = 0;
        
        String[] temp = binomial.split(" ");
        int a = Integer.parseInt(temp[0]);
        String op = temp[1];
        int b = Integer.parseInt(temp[2]);
        
        
        if(op.equals("+")) {
            answer = a + b;
        }
        else if(op.equals("-")) {
            answer = a - b;
        }
        else if(op.equals("*")) {
            answer = a * b;
        }
        
        return answer;
    }
}