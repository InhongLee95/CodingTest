import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    static LinkedList<Integer> list;
    static int N,K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        list = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }


        solution(list, K);



    }

    private static void solution(LinkedList<Integer>list, int K) {
        StringBuilder sb = new StringBuilder("<");
        Queue<Integer> queue = new LinkedList<>();


        //queue에 입력 값 추가
        for(int i = 0; i<list.size(); i++) {
            queue.add(list.get(i));
        }

        while(!queue.isEmpty()) {

            // K-1번까지 큐 값을 뒤로 보내기
            for(int i = 1; i<=K-1; i++) {
                int a = queue.remove();
                queue.add(a);
            }

            // K번째에서 remove하여 StringBuilder에 추가
            sb.append(queue.remove());

            if(!queue.isEmpty()) sb.append(", ");

        }

        sb.append(">");
        String answer = sb.toString();

        System.out.println(answer);

    }//solution

}