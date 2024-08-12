import java.math.BigInteger;
import java.util.Arrays;

class Solution {
    public long solution(long n) {
        // long을 String으로 변환
        String m = String.valueOf(n);
        
        // String을 char 배열로 변환
        char[] arr = m.toCharArray();
        
        // 문자 배열을 오름차순으로 정렬
        Arrays.sort(arr);
        
        // 배열을 역순으로 뒤집기
        StringBuilder sb = new StringBuilder(new String(arr));
        sb.reverse();
        
        // BigInteger를 사용하여 문자열을 숫자로 변환
        BigInteger bigInt = new BigInteger(sb.toString());
        
        // 결과를 long으로 변환 (범위를 초과할 수 있음에 유의)
        long answer = bigInt.longValue();
        
        return answer;
    }
}
