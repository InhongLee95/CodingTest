import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        List<Integer> result = new ArrayList<>();
        
        for(int[] query : queries){
            int s = query[0];
            int e = query[1];
            int k = query[2];
            
            List<Integer> list = new ArrayList<>();
            for(int i=s;i<=e;i++){
                if(k < arr[i]){
                    list.add(arr[i]);
                }
            }
            
            if(!list.isEmpty()){
                Collections.sort(list);
                result.add(list.get(0));
            }else{
                result.add(-1);
            }
        }
        
        int[] answer = new int[result.size()];
        for(int i=0;i<result.size();i++){
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}