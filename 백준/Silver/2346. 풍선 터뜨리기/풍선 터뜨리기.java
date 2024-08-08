import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

class Balloon {
    int index; 
    int value;

    public Balloon(int index, int value) {
        this.index = index;
        this.value = value;
    }
}

public class Main {

    public static void main(String[] args) throws IOException {
        // 선언
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Deque<Balloon> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(bf.readLine());
        
        int n = Integer.parseInt(st.nextToken());  // 풍선의 개수
        st = new StringTokenizer(bf.readLine());   // 두 번째 줄: 풍선의 이동 값들

        // 풍선 큐에 추가
        for (int i = 1; i <= n; i++) {
            deque.offer(new Balloon(i, Integer.parseInt(st.nextToken())));
        }

        // 풍선 터뜨리기 및 이동
        while (deque.size() > 1) {
            Balloon b = deque.poll();
            int m = b.value;
            sb.append(b.index).append(" ");

            if (m > 0) {
                for (int i = 0; i < m - 1; i++) {
                    Balloon tmp = deque.poll();
                    deque.offer(tmp);
                }
            } else if (m < 0) {
                for (int i = 0; i < Math.abs(m); i++) {
                    Balloon tmp = deque.pollLast();
                    deque.offerFirst(tmp);
                }
            }
        }

        // 마지막 남은 풍선
        Balloon m = deque.poll();
        sb.append(m.index);

        // 결과 출력
        System.out.println(sb.toString());
    }
}
