import java.io.*;
import java.util.*;

public class Main {

    static int x,y,c;
    static int[][] arr;
    static boolean[][] cheack;
    static int[] dirX = {0, 0, -1, 1};
    static int[] dirY = {1, -1, 0, 0};
    static int nowX, nowY;



    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());


        for(int k = 0; k <t; k++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());

            arr = new int[x][y];
            cheack = new boolean[x][y];
            int count = 0;

            for (int i = 0; i < c; i++) {
                st = new StringTokenizer(br.readLine());

                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                arr[a][b] = 1;
            }

            for(int i = 0; i<x; i++) {
                for(int j =0; j<y; j++) {
                    if(!cheack[i][j] && arr[i][j] ==1) {
                        dfs(i,j);
                        count++;
                    }

                }
            }

            System.out.println(count);

        }//t-for

    }



    static private void dfs(int x, int y) {

        cheack[x][y] = true;

        for(int i = 0; i<4; i++) {
            nowX = dirX[i] + x;
            nowY = dirY[i] + y;

            if(checkRange() && !cheack[nowX][nowY] && arr[nowX][nowY] == 1) {
                dfs(nowX,nowY);
            }
        }


    }

    static private boolean checkRange() {
        if(nowX >=0 && nowY >=0 && nowX <x && nowY <y) return true;
        else return false;
    }


}
