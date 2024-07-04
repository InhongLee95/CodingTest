class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int sum = 0;
        int mul = 1;
        
        for(int i = 0; i < num_list.length; i++) {
            sum += num_list[i];
        }
        
       for(int i = 0; i < num_list.length; i++) {
            mul *= num_list[i];
        }
        
        sum *= sum;
        
        System.out.println(sum + "+ " + mul);
        
        if(sum > mul) return 1;
        else return 0;
        
        
    }
}