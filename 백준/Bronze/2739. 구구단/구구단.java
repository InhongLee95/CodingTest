import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int input = Integer.parseInt(st.nextToken());


        for(int i=1; i<10; i++ ) {
            int result = input * i;
            System.out.println(input + " * "+i + " = " + result);
        }







    }
}