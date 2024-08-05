import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<Integer>[] arr;
    static boolean check[];
    static int node;
    static int[] answer;

    public static void main(String[] args) throws IOException {

        // 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        node = Integer.parseInt(br.readLine());

        StringTokenizer st;

        // 인접 리스트 배열 생성
        arr = new ArrayList[node + 1];
        for (int i = 1; i <= node; i++) {
            arr[i] = new ArrayList<>();
        }


        check = new boolean[node+1];
        answer = new int[node+1];

        // arr 초기화 무방향 그래프 형태 초기화
        for (int i = 1; i < node; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a].add(b);
            arr[b].add(a);
        }


        // bfs 호출
        bfs(1);


        // 결과 출력
        for(int i = 2; i<answer.length; i++) {
            System.out.println(answer[i]);
        }


    }

    public static void bfs(int start){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        check[start] = true;


        while (!queue.isEmpty()) {
            int now = queue.poll();

            for (int next : arr[now]) {
                if (!check[next]) {
                    check[next] = true;
                    // 해당 노드에 부모 노드 추가하기
                    answer[next] = now;
                    queue.add(next);
                }
            }//for
        }//while
    }
}