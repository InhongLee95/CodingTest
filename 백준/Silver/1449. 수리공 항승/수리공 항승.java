import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int answer = 0;
        int[] index = new int[N];
        int rl = 1;

        st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i<N; i++) {
            index[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(index);

        int tapeEnd = 0;  // 현재 테이프가 커버하는 끝 위치를 기록하는 변수

        for (int i = 0; i < N; i++) {
            // 현재 물이 새는 위치가 현재 테이프의 커버 범위를 넘어가면 새로운 테이프
            if (index[i] > tapeEnd) {
                // 새로운 테이프를 붙이고, 테이프의 끝 위치를 갱신  좌우1cm를 -해준다.
                tapeEnd = index[i] + L -1;
                answer++;
            }
        }

        System.out.println(answer);

    }


}
