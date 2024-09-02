import java.util.*;
import java.io.*;

public class Main {




    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int sum = 0;

        // 배열 입력
        for(int i = 0; i<9; i++) {
            int N = Integer.parseInt(br.readLine());
            arr[i] = N;
            sum += N;
        }

        boolean flag = false;

        for(int i = 0; i<8; i++) {
            for(int j = i+1; j<9; j++) {
                if(sum - arr[i] - arr[j] == 100) {
                    arr[i] = 0;
                    arr[j] = 0;
                    flag = true;
                    break;
                }
            }
            if(flag == true) break;
        }

        Arrays.sort(arr);

        for(int i=2; i<arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}
