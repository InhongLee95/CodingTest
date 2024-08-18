import java.util.*;
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
                arr[i][j] = inputs[j].equals(".");
            }
        }

        // 가로 공간 개수 체크
        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (arr[i][j]) {
                    count++;
                } else {
                    if (count >= 2) {
                        lowAsnwer++;
                    }
                    count = 0;
                }
            }
            if (count >= 2) {
                lowAsnwer++;
            }
        }

        // 세로 공간 개수 체크
        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (arr[j][i]) {
                    count++;
                } else {
                    if (count >= 2) {
                        colAnswer++;
                    }
                    count = 0;
                }
            }
            if (count >= 2) {
                colAnswer++;
            }
        }

        System.out.print(lowAsnwer + " ");
        System.out.print(colAnswer);
    }
}
