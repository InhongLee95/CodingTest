class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String str1 = Integer.toString(a);
        String str2 = Integer.toString(b);        
        
        String sum1 = str1 + str2;
        String sum2 = str2 + str1;
        
        int sum11 = Integer.parseInt(sum1);
        int sum12 = Integer.parseInt(sum2);
        
        if(sum11<sum12)  return sum12;
        else  return sum11;
        
        
        
        
        
    }
}
