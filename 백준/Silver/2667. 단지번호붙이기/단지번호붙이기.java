import java.io.*;
import java.util.*;

public class Main {

    static int n,tmp;
    static int nowX, nowY;
    static int[][] arr;
    static boolean[][] check;
    static int[] dirX= {0,0, -1, 1};
    static int[] dirY= {1,-1, 0, 0};


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;

        n = Integer.parseInt(br.readLine());

        arr = new int[n][n];
        check = new boolean[n][n];

        for(int i = 0; i<n; i++) {
            String str = br.readLine();
            char[] tmp = str.toCharArray();

            for(int j =0; j<tmp.length; j++){
                arr[i][j] = tmp[j] - '0';

            }
        }//for

        int dange = 0;


        ArrayList<Integer> house = new ArrayList<>();
        for(int i = 0; i< arr.length; i++) {
            for (int j = 0; j< arr.length; j++) {
                if(!check[i][j] && arr[i][j] == 1) {
                    tmp = 0;

                    dange++;
                    dfs(i, j);
                    house.add(tmp);

                }

            }

        }

        Collections.sort(house);

        System.out.println(dange);
        for(int i = 0; i<house.size(); i++) {
            System.out.println(house.get(i));
        }


    }//main


    private static void dfs(int x, int y) {
        check[x][y] = true;
        tmp++;

        for(int i = 0; i<4; i++) {
            nowX = x + dirX[i];
            nowY = y + dirY[i];

            if(rangeCheck() && !check[nowX][nowY] && arr[nowX][nowY] == 1) {
                dfs(nowX, nowY);
            }

        }


    }

    private static boolean rangeCheck() {
        if(nowX>=0 && nowY >=0 && nowX <n && nowY <n) return true;
        else return false;
    }

}//main class



