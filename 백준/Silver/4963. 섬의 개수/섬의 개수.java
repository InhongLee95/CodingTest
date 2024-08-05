import java.util.*;
import java.io.*;

public class Main {

    static int arr[][];
    static boolean check[][];
    static int dirX[] = {1,-1,0,0,1,1,-1,-1};
    static int dirY[] = {0,0,1,-1,1,-1,-1,1};
    static int w, h, nowX, nowY;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String str = " ";


        // 0 0 나올 때까지 무한 입력
        while (!(str = br.readLine()).equals("0 0")) {
            st = new StringTokenizer(str);
            w = Integer.parseInt(st.nextToken()); // 너비
            h = Integer.parseInt(st.nextToken()); // 높이
            arr = new int[h][w];
            check = new boolean[h][w];

            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());

                for (int j = 0; j < w; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }


        int island_count = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {

                if (!check[i][j] && arr[i][j] == 1) {
                    island_count++;
                    dfs(i, j);
                }

            }
        }//for

        sb.append(island_count).append('\n');

        }//while

        System.out.println(sb);
    }//main


    public static void dfs(int x, int y) {
        check[x][y] = true;

        for(int i = 0; i<8; i++){
            nowX = dirX[i] + x;
            nowY = dirY[i] + y;

            if(range_check() && !check[nowX][nowY] && arr[nowX][nowY]  ==1) {
                dfs(nowX, nowY);
            }
        }

    }

    public static boolean range_check() {
        return (nowX >=0 && nowY >=0 && nowX < h && nowY <w );
    }


}
