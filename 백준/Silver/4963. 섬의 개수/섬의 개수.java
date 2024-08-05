import java.util.*;
import java.io.*;

public class Main {

    static int arr[][];
    static boolean check[][];
    static int count;
    static int[] dirX = {1,-1,0,0,1,1,-1,-1};
    static int[] dirY = {0,0,1,-1,1,-1,1,-1};
    static int nowX, nowY, w,h;


    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String str = " ";

        // 0 0 나오기 전까지 무한 입력
        while(!(str = br.readLine()).equals("0 0")) {
            st = new StringTokenizer(str);

            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            arr = new int[h][w];
            check = new boolean[h][w];

            for(int i = 0; i<h; i++) {
                st = new StringTokenizer(br.readLine());

                for(int j = 0; j<w; j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }//for

            // 섬개수 측정 for문
            int islrand_count = 0;
            for(int i = 0; i<h; i++) {
                for(int j = 0; j<w; j++) {
                    if(arr[i][j] == 1 && !check[i][j]) {
                        islrand_count++;
                        dfs(i,j);
                    }


                }
            }//for

            sb.append(islrand_count).append('\n');

        }//while

        System.out.println(sb);

    }//main

    public static void dfs(int h, int w) {
        check[h][w] = true;


        for(int i = 0; i<8; i++) {
            nowX = dirX[i] + w;
            nowY = dirY[i] + h;

            if(island_scope()  && !check[nowY][nowX] && arr[nowY][nowX] == 1 ) {
                dfs(nowY, nowX);
            }

        }


    }//dfs

    public static boolean island_scope() {
        return (nowX >= 0  && nowY >= 0 && nowX <w && nowY < h);

    }




}
