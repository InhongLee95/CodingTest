import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        // num2 + 1을 사용하여 num2 인덱스까지 포함하도록 합니다.
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
                
    }
}
