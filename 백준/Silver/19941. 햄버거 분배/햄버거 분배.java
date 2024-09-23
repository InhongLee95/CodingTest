import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int answer = 0;

        String tmp = br.readLine();
        char[] food = tmp.toCharArray();

        for (int i = 0; i < food.length; i++) {
            if (food[i] == 'P') {
                // 사람의 위치에서 k거리까지 햄버거를 탐색
                int start = Math.max(0, i - k); // i - k가 음수인 경우 0으로 설정
                int end = Math.min(food.length - 1, i + k); // i + k가 배열 길이를 넘지 않도록 설정

                for (int j = start; j <= end; j++) {
                    if (food[j] == 'H') {
                        answer++;
                        food[j] = 'E'; // 햄버거를 먹었으므로 'E'로 표시
                        break;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
