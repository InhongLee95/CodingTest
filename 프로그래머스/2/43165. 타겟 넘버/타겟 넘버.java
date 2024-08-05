class Solution {
    static int count;
        
    public int solution(int[] numbers, int target) {
        int answer = 0;
        dfs(numbers, 0, target, 0);
        
        answer = count;
        
        
        
        
        return answer;
    }
    
    public static void dfs(int[]numbers, int depth, int target, int result) {
        if(depth == numbers.length) { // 마지막 노드까지 진행되었을 때
            if(target == result) { //target 값과 결과가 값다면 count++
                count++;
            }
            return;
        }//if
        
        
        int plus = result + numbers[depth]; // 플러스
        int minus = result - numbers[depth]; //마이너스
        
        dfs(numbers, depth+1, target, plus);
        dfs(numbers, depth+1, target, minus);
        
    }
    
}