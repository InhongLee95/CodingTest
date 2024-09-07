
import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int M = 0;

        for(int i = 1; i<=N; i++) {
            int num = i;
            int tmp = 0;

            while (num > 0 ) {
                tmp += num % 10;
                num = num / 10;

            }

            if(N == i + tmp ) {
                M = i;
                break;
            }

        }

        System.out.println(M);


    }
}