class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int countP = 0;
        int countY = 0;
        
        char[] input = s.toCharArray();
        
        for(int i =0; i<input.length; i++ ){
            if(input[i] == 'p' || input[i] == 'P') countP += 1;
            if(input[i] == 'y' || input[i] == 'Y') countY += 1;
            
        }
        
        if(countP == countY) answer = true;
        else if(countP != countY) answer = false;
        else if(countP == 0 && countY == 0) answer = true;
        
        
        

        return answer;
    }
}