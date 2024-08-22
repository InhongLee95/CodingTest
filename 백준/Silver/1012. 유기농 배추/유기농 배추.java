import java.util.*;
import java.io.*;

public class Main {
    static int N, M, K;
    static boolean[][] check;
    static int[][] arr;
    static int count;
    static int dirX[] = {1,-1,0,0};
    static int dirY[] = {0,0,1,-1};
    static int nowX, nowY;



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        StringTokenizer st;


        // 테스트 횟수
        for(int t = 0; t<test; t++) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            arr = new int[N][M];
            check = new boolean[N][M];


            // 배열 입력
            for(int i = 0; i<K; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                arr[x][y] = 1;
            }

            count = 0;

            // dfs 호출
            for(int i = 0; i<N; i++) {
                for(int j = 0; j<M; j++) {
                    if(!check[i][j] && arr[i][j] ==1) {
                        dfs(i, j);
                        count++;

                    }

                }

            }//for - dfs



            System.out.println(count);

        }//for



    }//main


    static private void dfs(int x, int y) {
        check[x][y] = true;

        for(int i =0; i<4; i++) {
            nowX = dirX[i] + x;
            nowY = dirY[i] + y;

            if(rangeCheck() && !check[nowX][nowY] && arr[nowX][nowY]==1) {
                dfs(nowX, nowY);
            }

        }




    }

    static private boolean rangeCheck() {
        if(nowX >=0 && nowY >=0 && nowX <N && nowY <M) return true;
        else return false;
    }


}
