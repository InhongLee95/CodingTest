
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();

        int M = 0; //결과 값을 저장하는 함수[생성자가 없으면 0을 출력하기 때문에 초기값 0]

        for(int i = 1; i <= N; i++) {
            int number = i; // i값
            int res = 0; //각 자리수를 더한 값을 저장하는 변수
            
            // 198이 들어왔다고 가정하면 -> res 값은 18이 된다.
            // 18 + i 면 생성자 값이 나온다.
            while(number > 0){ // 해당 값이 0보다 작아질때까지 반복
                res += number % 10; // 1. 현재 숫자의 마지막 자릿수를 더한다.
                number /= 10; //2. 숫자를 10으로 나눠서 마지막 자릿수를 제거한다.
            }

            if(res + i == N){ //만약 현재 i(즉 i마다 반복문 시작했을 때의 초기 number)값이랑 해당 자리수를 누적더한 값과 같을때
                M = i; // 생성자라는 뜻이니 M에 i를 넣고
                break; //반복문을 마친다.(가장 작은 생성자를 출력하니까)
            }
        }
        bw.write(M + "\n");
        bw.flush();
        bw.close();
    }
}