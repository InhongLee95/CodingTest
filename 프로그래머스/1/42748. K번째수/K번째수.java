import java.util.Arrays;


class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];        
        
		for (int i = 0; i < commands.length; i++) {
            // i~j 범위까지 array의 배열을 temp에 copy    
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            
            Arrays.sort(temp);
            
            //[i][2] 번째 요소에 있는 k번째에 있는 값을 추출하여 answer을 반환
            answer[i] = temp[commands[i][2] - 1];
            
        }
        
        
        return answer;
    }
}