import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int monster = Integer.parseInt(st.nextToken());

        int[] food = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++) {
            food[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(food);

        for(int i = 0; i < n; i++) {
            if(monster >= food[i]) monster++;
        }

        System.out.println(monster);


    }
}
