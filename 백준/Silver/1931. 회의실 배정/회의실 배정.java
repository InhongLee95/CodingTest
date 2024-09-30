import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;

        int n = Integer.parseInt(br.readLine());
        ArrayList<Time> list =new ArrayList<>();

        for(int i = 0; i<n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            list.add(new Time(s,e));

        }


        Collections.sort(list);

        // 첫 미팅은 무조건 시작
        int answer = 1;

        // 첫 미팅의 종료시간 부터 체크
        int time = list.get(0).end;

        for(int i = 1; i<list.size(); i++) {
            if(time <= list.get(i).start) {
                answer++;
                // 매 회의 종료시간으로 time 기준 대입
                time = list.get(i).end;
            }

        }



    System.out.println(answer);

    }//main



}//main class

class Time implements Comparable<Time> {
    int start;
    int end;

    Time(int start, int end){
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Time o) {
        if (this.end == o.end) {
            return this.start - o.start;
        }
        else if(this.end > o.end) {
            return 1;
        }
        else return -1;
    }


}

