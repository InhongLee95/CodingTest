import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;

        while (true) {
            int[] previousArr = arr.clone(); // 현재 배열 상태를 복제
            
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) { // 50보다 크거나 같은 짝수인 경우
                    arr[i] /= 2;
                } else if (arr[i] < 50 && arr[i] % 2 != 0) { // 50보다 작은 홀수인 경우
                    arr[i] = arr[i] * 2 + 1;
                }
            }

            answer++; // 반복 횟수 증가

            if (Arrays.equals(arr, previousArr)) { // 배열 상태가 변화가 없을 때 반복 종료
                break;
            }
        }

        return answer -1;
    }
}
