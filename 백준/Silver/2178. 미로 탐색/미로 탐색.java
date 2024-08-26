import java.io.*;
import java.util.*;

public class Main {

    static int N,M;
    static int[][] arr;
    static boolean[][] check;
    static int[] dirX = {0,0,1,-1};
    static int[] dirY = {1,-1,0,0};
    static int nowX, nowY;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());


        arr = new int[N][M];
        check = new boolean[N][M];



        for(int i = 0; i<N; i++) {
            char[] tmp = br.readLine().toCharArray();
            for(int j = 0; j<M; j++) {
                arr[i][j] = tmp[j] - '0';
            }
        }


        //bfs 호출
        bfs(0,0);

        // 도착지점의 값을 출력 (최단 경로 길이)
        System.out.println(arr[N-1][M-1]);


    }

    static private void bfs(int x, int y) {
        // bfs 호출 시점에 방문 체크
        check[x][y] = true;

        Queue<Index> queue = new LinkedList<>();
        queue.offer(new Index(x,y));

        while (!queue.isEmpty()) {
            Index now = queue.poll();

            for(int i = 0; i<4; i++) {
                nowX = dirX[i] +now.x;
                nowY = dirY[i] + now.y;

                if(rangeCheck() && !check[nowX][nowY] && arr[nowX][nowY] >= 1) {
                    // for문 안에서 방문 체크
                    check[nowX][nowY] = true;
                    arr[nowX][nowY] = arr[now.x][now.y] +1;
                    queue.offer(new Index(nowX, nowY));

                }

                // 도착지점까지 방문했을 때, 종료
                if (nowX == N-1 && nowY == M-1) {
                    return;
                }

            }
        }//while


    }//dfs

    static private boolean rangeCheck() {
        if(nowX >=0 && nowY >=0 && nowX<N &&nowY<M) return true;
        else return false;

    }

}// class Main

class Index{
    int x;
    int y;
    Index(int x, int y) {
        this.x = x;
        this.y = y;
    }

}
