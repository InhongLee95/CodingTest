import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        // 배열에서 나눠서 0이 되는 값만 리스트에 추가
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) list.add(arr[i]);
        }
        
        
        int[] answer;
        
        // 나누어 떨어지는 값이 없을 경우 -1 배열을 반환
        if(list.size() == 0) {
            answer = new int[]{-1};
        } 
        else {
            // 리스트 크기에 맞는 배열을 생성하고 값을 복사
            answer = new int[list.size()];
            for(int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
            
            Arrays.sort(answer);
        }
        
        return answer;
    }
}
