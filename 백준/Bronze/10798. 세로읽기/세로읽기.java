import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] str = new String[5][15];
        String answer = "";
        int max = 0;


        // 값 대입
        for(int i = 0; i<str.length; i++) {
            String input = br.readLine();
            if(input.length() > max) max = input.length();
            for(int j = 0; j<15; j++) {
                if(j > input.length()-1) break;
                str[i][j] = String.valueOf(input.charAt(j));
            }
        }


        // 세로 읽기
        for(int i = 0; i<15; i++) {
            if(i > max) break;
            for(int j = 0; j<str.length; j++) {
                if(str[j][i] != null) answer += str[j][i];
            }

        }

        System.out.println(answer);


    }
}