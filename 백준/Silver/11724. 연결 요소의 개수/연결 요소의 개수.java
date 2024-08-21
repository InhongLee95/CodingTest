import java.util.*;
import java.io.*;

public class Main {
    static int N, M;
    static boolean[] check;
    static int[][] arr;
    static int count = 0;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N+1][N+1];
        check = new boolean[N+1];

        for(int i = 0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            arr[x][y] = arr[y][x] = 1;
        }


        // 그래프 개수 구하기 위해서 for문으로 dfs 호출
        for(int i=1; i<=N; i++) {
            if (!check[i]){
                dfs(i);
                count++;
            }
        }//for

        System.out.print(count);

    }




    static private void dfs(int start) {


        // 이미 체크된 노드는 return
        if(check[start]) {
            return;
        }

        check[start] = true;
        for(int i = 1; i<=N; i++) {
            if(arr[start][i] == 1) {
                dfs(i);
            }

        }//for

    }



}
