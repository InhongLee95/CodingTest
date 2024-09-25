import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        // N 값 입력
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];

        // 배열 입력
        for(int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }


        for(int i = 0 ;i<N; i++) {
            if(arr[i].equals("KBS1")) { //KBS1부터 첫번째로
                String tmp = "";
                for(int j = i; j>0; j--) {
                    System.out.print(4);
                    tmp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = tmp;
                }
                break;
            }
            else System.out.print(1);
        }

        if(arr[1].equals("KBS2"))//KBS1을 첫번째로 옮기고 만약 KBS2가 두번째에 있다면 정상 종료
            System.exit(0);

        for(int i = 0 ;i<N; i++) {
            if(arr[i].equals("KBS2")) {//KBS2를 두번쨰로
                String tmp = "";
                for(int j = i; j>1; j--) {
                    System.out.print(4);
                    tmp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = tmp;
                }
                break;
            }
            else
                System.out.print(1);
        }



    }
}