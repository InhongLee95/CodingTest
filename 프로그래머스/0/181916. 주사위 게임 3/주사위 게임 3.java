import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {

        int[] dice = { a, b, c, d };
        Arrays.sort(dice); // 주사위 값들을 정렬하여 작은 값부터 큰 값 순서로 배열

        int ans = 0; // 결과 값을 저장할 변수 초기화

        // 첫 번째 조건: 네 주사위 값이 모두 같을 때
        if (dice[0] == dice[3]) {
            ans = 1111 * dice[3]; // 1111 × p 점을 얻습니다. (p는 주사위 값)
        } 
        // 두 번째 조건: 세 주사위 값이 p로 같고 나머지 하나가 q인 경우 (p ≠ q)
        else if (dice[0] == dice[2] || dice[1] == dice[3]) {
            // 두 쌍 중에서 같은 값을 찾기 위해 조건 검사
            ans = (int) Math.pow(dice[1] * 10 + (dice[0] + dice[3] - dice[1]), 2); // (10 × p + q)^2 점을 얻습니다.
        } 
        // 세 번째 조건: 두 쌍의 주사위 값이 각각 p와 q로 같을 때 (p ≠ q)
        else if (dice[0] == dice[1] && dice[2] == dice[3]) {
            ans = (dice[0] + dice[3]) * (dice[3] - dice[0]); // (p + q) × |p - q| 점을 얻습니다.
        } 
        // 네 번째 조건: 두 주사위 값이 p로 같고 두 주사위 값이 각각 q와 r로 다를 때 (q ≠ r)
        else if (dice[0] == dice[1]) {
            ans = dice[2] * dice[3]; // q × r 점을 얻습니다.
        } else if (dice[1] == dice[2]) {
            ans = dice[0] * dice[3]; // q × r 점을 얻습니다.
        } else if (dice[2] == dice[3]) {
            ans = dice[0] * dice[1]; // q × r 점을 얻습니다.
        } 
        // 다섯 번째 조건: 네 주사위 값이 모두 다를 때
        else {
            ans = dice[0]; // 가장 작은 주사위 값 만큼의 점수를 얻습니다.
        }

        return ans; // 계산된 결과를 반환
    }
}
