import java.io.BufferedInputStream;
import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int minus = 45;

        if(M - minus < 0) {
            if(H == 0) {
                H = 24;
            }
            H = H -1;
            M = M + 60;
            M = M - minus;
            System.out.println(H+" "+ M);

        } else {
            M = M - minus;
            System.out.println(H+" "+ M);
        }







    }
}