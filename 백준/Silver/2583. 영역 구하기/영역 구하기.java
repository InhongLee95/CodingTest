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
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());


        arr = new int[N][M];
        check = new boolean[N][M];
        size = new ArrayList<>();



        // 테이블 입력
        // 여기는 수학적 좌표 기반으로 입력받음
        for(int i = 0; i<K; i++) {
            st = new StringTokenizer(br.readLine());
            int startY = Integer.parseInt(st.nextToken());
            int startX = Integer.parseInt(st.nextToken());
            int endY = Integer.parseInt(st.nextToken());
            int endX = Integer.parseInt(st.nextToken());

            for(int j = startX; j<endX; j++) {
                for(int k = startY; k<endY; k++) {
                    arr[j][k] = 1;
                }

            }
        }//for

        // 배열 인덱스


        // dfs 호출
        for(int i = 0; i<N; i++) {

            for(int j = 0; j<M; j++) {
                if(!check[i][j] && arr[i][j] == 0 ) {
                    tmp = 0;
                    dfs(i, j);
                    size.add(tmp);
                    count++;
                }

            }
        }

        // 사이즈 정렬
        Collections.sort(size);



        // 출력
        System.out.println(count);
        for(int i =0; i<size.size(); i++) {
            if(i == size.size()-1) System.out.print(size.get(i));
            else System.out.print(size.get(i) + " ");
        }



    }//main


    static private void dfs(int x, int y) {
        check[x][y] = true;
        tmp += 1;

        for(int i = 0; i<4; i++) {
            nowX = dirX[i] + x;
            nowY = dirY[i] + y;

            if(rangeCheck() && !check[nowX][nowY] && arr[nowX][nowY] == 0) {
                dfs(nowX, nowY);

            }
        }





    }
    static private boolean rangeCheck() {
        if(nowX >= 0 && nowY >=0 && nowX <N && nowY <M) return true;
        else return false;

    }


}
