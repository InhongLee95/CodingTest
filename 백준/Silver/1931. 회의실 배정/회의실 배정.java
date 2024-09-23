import java.io.*;
import java.util.*;




public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        ArrayList<MeetingRoom> list = new ArrayList<>();
        int N  = Integer.parseInt(br.readLine());


        // 리스트 입력
        for(int i = 0; i<N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            list.add(new MeetingRoom(start, end));


        }//for

        Collections.sort(list); //회의실을 종료 시간을 기준으로 정렬
        int count = 0;
        int time = 0;  //현재 시간
        for (int i = 0; i < N; i++) {
            //만약에 현재 시간이 i번째 회의 시작 시간보다 작거나 같으면 포함시킨다
            if (time <= list.get(i).start) {
                count++;
                time = list.get(i).end;  //그리고 현재 시간은 i번째 회의가 끝난 시간이 된다
            }
        }
        System.out.print(count);


    }// main
}


class MeetingRoom implements Comparable<MeetingRoom> {
    int start;
    int end;

    MeetingRoom(int start, int end) {
        this.start = start;
        this.end = end;
    }


    @Override
    public int compareTo(MeetingRoom o) {
        if(this.end == o.end) {
            return this.start - o.start; // 오름 차순도 되고 내림차순도 된다
        }
        return this.end - o.end; //  this.end 값이 더 크면 오름차순으로 반환
    }

}// point

