import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(">");

        
        // N 값 입력
        String N = br.readLine();
        
        // 10 미만 숫자 0 추가
        if(Integer.parseInt(N) < 10 ) N = N + "0";
        
        //  N값이랑 비교할 대상 선언
        String check = N;
        int answer = 0;


        while (true) {
            sb.delete(0,sb.length());

            char a =  check.charAt(0);
            char b =  check.charAt(1);


            int A = Character.getNumericValue(a);
            int B = Character.getNumericValue(b);


            int sum = A+B;

            String k =  String.valueOf(sum);


            sb.append(b);
            if(k.length() < 2) sb.append(k.charAt(0));
            else  sb.append(k.charAt(1));


            check = sb.toString();
            answer++;

            if(check.equals(N)) break;


        }//while


        System.out.println(answer);



    }



}