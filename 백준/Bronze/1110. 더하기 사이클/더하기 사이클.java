
import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder("<");

        String N = br.readLine();

        if(Integer.parseInt(N) < 10) {
            N = N + "0";

        }

        String check = N;
        int answer = 0;




        while(true) {
            sb.delete(0, sb.length());

            char a = check.charAt(0);
            char b = check.charAt(1);

            int two = Character.getNumericValue(a);
            int one = Character.getNumericValue(b);

            int sum = two + one;

            String tmp = String.valueOf(sum);


            // sum 전 첫자리 수 문자 더하기
            sb.append(b);

            //sum이 2자리 수 가 안되면 0 추가
            if(tmp.length() < 2) sb.append(tmp.charAt(0));
            else  sb.append(tmp.charAt(1));

            //변경된 값 check 에 담기
            check = sb.toString();

            // 찾는 횟수 카운트
            answer++;

            if(check.equals(N)) {
                break;
            }

        }


        System.out.println(answer);



    }



}