import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");


        int n = Integer.parseInt(st.nextToken()); // 현재 랭크순위 등록된 개수를 의미
        int newScore = Integer.parseInt(st.nextToken()); // 새 점수
        int p = Integer.parseInt(st.nextToken()); // 랭크 순위 최대 등록 가능한 수

        // 랭킹리스트에 값이 없다면 - 뒤에 더 받는 값이 없기에 여기서 종료
        if(n==0){
            System.out.println(1);
            return;
        }

        st = new StringTokenizer(br.readLine(), " ");
        int[] scores = new int[n];
        for(int i=0;i<n;i++) {
            int score = Integer.parseInt(st.nextToken());
            scores[i] = score;
        }

        int result = solution(scores, n, newScore, p);
        System.out.println(result);


    }

    private static int solution(int[] scores, int n, int newScore, int p) {

        // 랭킹리스트가 가득차있으며, 가장 작은값보다 작거나 같다면 못넣음
        if(n==p && scores[n-1] >= newScore)
            return -1;

        // 랭킹리스트에서 자기 위치 찾기
        int rank = 1;
        int prev = -1;
        for(int i=0;i<n;i++) {
            if(scores[i] > newScore){
                // 같은 값이 여러개에 있을 경우, 맨 앞에 하나에 대해서만 rank 증가
                if(scores[i] == newScore && prev == newScore)
                    continue;
                rank++;
            }
            prev = scores[i];
        }//for
        return rank;
    }

}
