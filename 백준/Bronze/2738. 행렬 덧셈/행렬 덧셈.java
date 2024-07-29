import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr1 = new int[N][M];
        int[][] arr2 = new int[N][M];

        for (int i = 0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<M; j++) {
                int input = Integer.parseInt(st.nextToken());
                arr1[i][j] = input;
            }
        }//for

        for (int i = 0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<M; j++) {
                int input = Integer.parseInt(st.nextToken());
                arr2[i][j] = input;
            }
        }//for

        for (int i = 0; i<N; i++) {
            for(int j = 0; j<M; j++) {
                arr1[i][j] += arr2[i][j];
            }
        }//for


        for (int i = 0; i<N; i++) {
            for(int j = 0; j<M; j++) {
                System.out.printf(arr1[i][j] + " ");
            }
            System.out.println();
        }//for


    }
}