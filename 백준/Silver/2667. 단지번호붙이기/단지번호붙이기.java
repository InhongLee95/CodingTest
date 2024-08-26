import java.util.*;
import java.io.*;

public class Main {
    static int N, M, K;
    static int[][] arr;
    static boolean[][] check;
    static int[] dirX = {1,-1,0,0};
    static int[] dirY = {0,0,1,-1};
    static int nowX, nowY;
    static int count = 0;
    static ArrayList<Integer> size;
    static int tmp;



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        arr = new int[N][N];
        check = new boolean[N][N];
        size = new ArrayList<>();


        // 배열 입력
        for(int i = 0; i<N; i++) {
            char[] temp = br.readLine().toCharArray();
            for (int j = 0; j<N; j++) {
                arr[i][j] = temp[j] - '0'; // '0' or '1' -> 숫자로 변환
            }
        }// 배열 입력


        //dfs 호출
        for(int i = 0; i<N; i++ ) {
            for(int j =0; j<N; j++) {
                if(!check[i][j] && arr[i][j]==1) {
                    tmp = 1; // 처음에 size1로 초기화한다. 해당 for문에서 호출된 dfs size+1
                    dfs(i, j);
                    count++;
                    size.add(tmp);
                }


            }
        }

        // size 정렬
        Collections.sort(size);


        System.out.println(count);
        for(int i = 0; i<size.size(); i++) {
            System.out.println(size.get(i));
        }


    }//main


    static private void dfs(int x, int y) {
        check[x][y] = true;

        for(int i = 0; i<4; i++) {
            nowX = dirX[i] + x;
            nowY = dirY[i] + y;

            if (rangeCheck() && !check[nowX][nowY] && arr[nowX][nowY]==1) {
                tmp++;
                dfs(nowX, nowY);

            }
        }



    }

    static private boolean rangeCheck() {
        if(nowX >=0 && nowY >= 0 &&  nowX< N && nowY < N) return true;
        else return false;

    }

}
