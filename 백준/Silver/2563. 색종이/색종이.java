import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    boolean[][] arr = new boolean[100][100];

    int count = Integer.parseInt(br.readLine());
    int answer = 0;

    // arr checking
    for(int i = 0; i<count; i++) {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        for(int j = y; j<y+10; j++) {
            for(int k = x; k<x+10; k++) {
                arr[j][k] = true;
            }
        }
    }//for

    for(int i = 0; i<arr.length; i++) {
        for(int j = 0; j<arr[i].length; j++) {
            if(arr[i][j] == true) answer++;
        }
    }

    System.out.print(answer);

    }
}