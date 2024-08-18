import java.util.*;
import java.io.*;

public class Main {
    static int N, M;
    static int[][] arr;
    static boolean[] check;
    static int answer = 0;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        StringTokenizer st;

        arr = new int[N+1][N+1];
        check = new boolean[N+1];


        //
        for (int i = 0; i<M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a][b] = arr[b][a] = 1;
        }

        bfs(1);

        System.out.println(answer-1);


    }


    private static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);


        while(!queue.isEmpty()) {
            int now = queue.poll();

            if(!check[now]) {
                answer++;
                check[now] = true;

                for (int i = 1; i <= N; i++) {
                    if (arr[now][i] == 1 && !check[i]) {
                        queue.offer(i);
                    }
                }
            }//if
        }//while


    }


}
