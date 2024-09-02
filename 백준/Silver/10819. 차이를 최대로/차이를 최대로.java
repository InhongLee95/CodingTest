import java.util.*;
import java.io.*;

public class Main {
    static int N, result;
    static int[] A, tmp;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        A = new int[N];
        tmp = new int[N];   // 📍 각 순열 케이스를 담을 임시 저장 배열
        visited = new boolean[N];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0 ; i < N ; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0);
        System.out.println(result);
    }

    // 🔔 백트래킹 🔔
    private static void dfs(int cnt) {
        if(cnt == N) {
            int sum = 0;
            for(int i = 0 ; i < N - 1 ; i++) {
                sum += Math.abs(tmp[i] - tmp[i + 1]);
            }
            result = Math.max(result, sum);
            return;
        }

        for(int i = 0 ; i < N ; i++) {
            if(visited[i])  continue;

            visited[i] = true;

            tmp[cnt] = A[i];    // 📍 담음
            dfs(cnt + 1);       // 🔔 재귀로 만들고, 그 다음 idx 늘리기

            visited[i] = false; // ⭐ 다 만들고 false로 방문 해제
        }
    }
}
