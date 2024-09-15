import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> results = new ArrayList<>();

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());
            int[] dp = new int[11];

            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;

            for (int i = 4; i <= n; i++) {
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            }

            results.add(dp[n]);
        }

        // Print all results at once
        for (int result : results) {
            System.out.println(result);
        }
    }
}
