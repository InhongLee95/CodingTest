class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        int[] count = new int[included.length];
        int first = a;
        count[0] = first;
        
        for (int i = 1; i < included.length; i++) {
            first = first + d;
            count[i] = first;
        }
        
        for(int i = 0; i < included.length; i ++) {
            if(included[i] == true) answer += count[i];
        }
        
        return answer;
    }
}