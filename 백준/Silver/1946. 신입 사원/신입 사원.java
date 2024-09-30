import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;

        // 테스트 수
        int t = Integer.parseInt(br.readLine());

        for(int k = 0; k<t; k++) {

            // 지원자 점수
            ArrayList<People> list = new ArrayList<>();

            // 지원자 수
            int p = Integer.parseInt(br.readLine());




            for(int i = 0; i<p; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                int point = Integer.parseInt(st.nextToken());
                int meeting = Integer.parseInt(st.nextToken());

                list.add(new People(point, meeting));

            }

            // 서류 점수 기준으로 정렬
            Collections.sort(list);

            // 0번째 기준으로 다음 합격자 체크
            int base = list.get(0).meeting;

            // 0번 은 자동합격이므로 1로 시작
            int answer = 1;

            for(int i = 1; i<list.size(); i++) {
                if(base > list.get(i).meeting) {
                    answer++;
                    base = list.get(i).meeting;

                }

            }

            System.out.println(answer);

        }//T for







    }



}

 class People implements Comparable<People> {
    int point;
    int meeting;

    People(int point, int meeting) {
        this.point = point;
        this.meeting = meeting;
    }

    @Override
    public int compareTo(People o) {

        if(this.point > o.point) return 1;
        else return -1;
    }

}