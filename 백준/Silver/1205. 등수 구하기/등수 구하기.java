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


        if(n == p && newScore <= scores[scores.length-1]) {
            System.out.println(-1);
        }
        else{
            int rank = 1;

            for(int i = 0; i<scores.length; i++) {
                if (scores[i] > newScore) rank++;
                else {
                    break;
                }
            }
             System.out.println(rank);

        }



    }


}
