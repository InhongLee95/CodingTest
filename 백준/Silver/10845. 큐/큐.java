import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String tmp = br.readLine();

            if (tmp.startsWith("push")) {
                // 'push' 뒤에 있는 숫자를 큐의 뒤에 추가
                int value = Integer.parseInt(tmp.split(" ")[1]);
                queue.offerLast(value);
            }
            else if (tmp.equals("pop")) {
                // 큐의 앞에서 값을 빼고 출력, 비어있으면 -1 출력
                if (!queue.isEmpty()) {
                    System.out.println(queue.pollFirst());
                } else {
                    System.out.println(-1);
                }
            }
            else if (tmp.equals("size")) {
                System.out.println(queue.size());
            }
            else if (tmp.equals("empty")) {
                System.out.println(queue.isEmpty() ? 1 : 0);
            }
            else if (tmp.equals("front")) {
                // 큐의 앞에 있는 값을 출력 (삭제하지 않음)
                if (!queue.isEmpty()) {
                    System.out.println(queue.peekFirst());
                } else {
                    System.out.println(-1);
                }
            }
            else if (tmp.equals("back")) {
                // 큐의 뒤에 있는 값을 출력 (삭제하지 않음)
                if (!queue.isEmpty()) {
                    System.out.println(queue.peekLast());
                } else {
                    System.out.println(-1);
                }
            }
        }
    }
}
