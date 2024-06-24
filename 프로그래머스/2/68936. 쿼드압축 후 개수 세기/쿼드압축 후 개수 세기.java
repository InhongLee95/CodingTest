class Solution {
    static int[] answer;
    static int zeroCount = 0;
    static int oneCount = 0;
    public int[] solution(int[][] arr) {
   

        // 영역 분할 메서드 호출
        //arr.length 기본적으로 행 기준 배열의 length를 반환한다.
        //열 기준의 arr.length length를 반환하고 싶다면arr[0].length 이렇게 해야함
        recursion(arr, 0, 0, arr.length);
        
        answer = new int[2];
        answer[0] = zeroCount;
        answer[1] = oneCount;
        return answer;
    }
    // 영역 분할 메서드
    static void recursion(int[][] arr, int x, int y, int size) {
        // 현재 영역이 압축 가능하다면 answer 배열에 값 추가하고 반환
        if (compact(arr, x, y, size)) {
            if(arr[x][y] == 0){
		            zeroCount++;
            }else if(arr[x][y] == 1){
		            oneCount++;
            }
            return;
        }
        // 1번 영역
        // 재귀 메서드이므로, 1번 영역 분할이 완료되면 -> 2번 영역으로 분할하게 된다.
        recursion(arr, x, y, size / 2);
        // 2번 영역
        recursion(arr, x + size / 2, y, size / 2);
        // 3번 영역
        recursion(arr, x, y + size / 2, size / 2);
        // 4번 영역
        recursion(arr, x + size / 2, y + size / 2, size / 2);
    }

    // 압축 가능한지 판단하는 메서드
    static boolean compact(int[][] arr, int x, int y, int size) {
        for (int i = x; i < x + size; i++) { // 행변경하면서 체크
            for (int j = y; j < y + size; j++) { // 열변경하면서 체크
								// x 및 y 값은 처음 찍은 값이 고정이고, i 및 j 값만 +1하면서 포인터가 움직인다. 
								// 고정된 좌표랑 변경된 [i][j] 좌표랑 비교해서 값이 계속 동일한지 체크
                // 영역의 첫번째 값과 나머지를 비교하다 하나다로 다르면 반환
                if(arr[x][y] != arr[i][j]) {
		                //체크하는 arr[x][y] 기준으로 -> 실제 arr[][] 값이 다르면 압축 불가능 판별
                    return false;
                }
            }
        }
        // compact()가 true이면 압축이 가능하다는 의미
        return true;
    }
}