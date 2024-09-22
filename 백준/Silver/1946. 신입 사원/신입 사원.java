import java.io.*;
import java.util.*;




public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T  = Integer.parseInt(br.readLine());


        // 테스트 횟수 지정
        for(int i = 0; i<T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            ArrayList<Point> list = new ArrayList<>();

            int N = Integer.parseInt(st.nextToken());


            // 리스트에 입력
            for(int j = 0; j<N; j++) {
                st = new StringTokenizer(br.readLine(), " ");

                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                list.add(new Point(x, y));


            }

            Collections.sort(list);

            // 서류성적이 제일 높은 0번째 사람은 합격
            int answer = 1;
            // 0번째 기준으로 다음 합격자 체크
            int min = list.get(0).y;

            for(int j = 1; j<list.size(); j++) { // 서류 2등부터 시작
                int tmpMin = list.get(j).y;

                if(tmpMin < min ) { // 이전의 최소 면접 점수보다 낮으면 통과
                    answer++;
                    min = tmpMin; // 새 합격자 점수 기준으로 체크하기 위해 갱신
                }

            }

            System.out.println(answer);



        }//for

    }
}


class Point implements Comparable<Point> {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    @Override
    public int compareTo(Point o) {
        if(this.x > o.x) {
            return 1;
        }
        else {
            return -1;
        }
    }
}// point

