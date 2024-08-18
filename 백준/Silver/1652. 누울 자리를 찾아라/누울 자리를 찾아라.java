import java.io.*;

public class Main {
    static int N;
    static boolean[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new boolean[N][N];
        int lowAsnwer = 0;
        int colAnswer = 0;

        // 배열 입력
        for (int i = 0; i < N; i++) {
            String[] inputs = br.readLine().split("");
            for (int j = 0; j < N; j++) {
                String input = inputs[j];
                if (input.equals(".")) arr[i][j] = true;
            }
        }

        int count = 0;

        // 가로 공간 개수 체크
        for (int i = 0; i < N; i++) {
            count = 0;  // 매 줄마다 count를 초기화
            for (int j = 0; j < N; j++) {
                if (arr[i][j]) {
                    count++;
                } else {  // 장애물을 만났을 때
                    if (count >= 2) {  // 빈 공간이 2 이상인 경우
                        lowAsnwer++;
                    }
                    count = 0;  // count 초기화
                }
            }
            if (count >= 2) {  // 줄의 끝에서 빈 공간이 2 이상인 경우
                lowAsnwer++;
            }
        }

        // 세로 공간 개수 체크
        for (int i = 0; i < N; i++) {
            count = 0;  // 매 열마다 count를 초기화
            for (int j = 0; j < N; j++) {
                if (arr[j][i]) {
                    count++;
                } else {  // 장애물을 만났을 때
                    if (count >= 2) {  // 빈 공간이 2 이상인 경우
                        colAnswer++;
                    }
                    count = 0;  // count 초기화
                }
            }
            if (count >= 2) {  // 열의 끝에서 빈 공간이 2 이상인 경우
                colAnswer++;
            }
        }

        System.out.print(lowAsnwer + " ");
        System.out.print(colAnswer);
    }
}
