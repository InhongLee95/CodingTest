class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        // 왼손의 위치를 10으로 초기화 (왼손의 '*' 키패드 위치)
        int left = 10;
        // 오른손의 위치를 12로 초기화 (오른손의 '#' 키패드 위치)
        int right = 12;

        for (int i : numbers) {
            // 숫자가 1, 4, 7인 경우 왼손으로 누르고, 왼손의 위치를 갱신
            if (i == 1 || i == 4 || i == 7) {
                answer += "L";
                left = i;
            // 숫자가 3, 6, 9인 경우 오른손으로 누르고, 오른손의 위치를 갱신
            } else if (i == 3 || i == 6 || i == 9) {
                answer += "R";
                right = i;
            } else {
                // 숫자가 0인 경우 키패드 위치를 11로 변환
                if (i == 0) i = 11;

                // 왼손과의 거리와 오른손과의 거리를 계산
                // 나누기는 상하 움직임 나머지는 좌우 움직임
                int leftDistance = Math.abs(i - left) / 3 + Math.abs(i - left) % 3;
                int rightDistance = Math.abs(i - right) / 3 + Math.abs(i - right) % 3;

                // 왼손이 가까운 경우
                if (leftDistance < rightDistance) {
                    answer += "L";
                    left = i;
                // 오른손이 가까운 경우
                } else if (leftDistance > rightDistance) {
                    answer += "R";
                    right = i;
                // 거리가 같은 경우
                } else {
                    // 왼손잡이인 경우
                    if (hand.equals("left")) {
                        answer += "L";
                        left = i;
                    // 오른손잡이인 경우
                    } else {
                        answer += "R";
                        right = i;
                    }
                }
            }
        }
        return answer;
    }
}
