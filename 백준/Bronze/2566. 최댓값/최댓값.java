import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        int[][] arr = new int[9][9];
        int max = 0;
        int index1 = 0;
        int index2 = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                int input = Integer.parseInt(st.nextToken(" "));
                arr[i][j] = input;
            }
        }//for

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    index1 = i;
                    index2 = j;
                }
            }
        }//for

        System.out.println(max);
        System.out.println((index1 + 1) + " " + (index2 + 1));
    }
}