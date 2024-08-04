import java.util.*;
import java.io.*;

public class Main {

    static boolean[] check;
    static int[][] arr;
    static int A;
    static int B;
    static int count;

    public static void main(String[] args) throws IOException {

        // check 배열 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        A = Integer.parseInt(br.readLine());
        check = new boolean[A + 1];

        // count 값 초기화
        count = 0;

        // 입력값 배열 생성
        B = Integer.parseInt(br.readLine());
        arr = new int[A + 1][A + 1];

        // 배열에 값 입력
        for (int i = 0; i < B; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            arr[x][y] = 1;
            arr[y][x] = 1;
        }

        // 시작 노드를 1로 설정
        bfs(1);
        
        // 시작 노드 -1 로 제외
        System.out.println(count-1);
    }

    public static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);

        while (!queue.isEmpty()) {
            int now = queue.poll();

            if (!check[now]) {
                count++;
                check[now] = true;

                // bfs 원리
                for (int i = 1; i <= A; i++) {
                    if (arr[now][i] == 1 && !check[i]) {
                        queue.add(i);
                    }
                }
            }
        }
    }
}
