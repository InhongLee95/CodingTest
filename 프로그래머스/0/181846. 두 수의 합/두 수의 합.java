import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        BigInteger tempA = new BigInteger(a);
        BigInteger tempB = new BigInteger(b);        
        
        BigInteger answer = tempA.add(tempB);
        
        return answer.toString();
    }
}
