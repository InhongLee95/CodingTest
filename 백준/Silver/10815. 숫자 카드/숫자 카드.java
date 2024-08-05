import java.util.*;
import java.io.*;

public class Main {

    static int N, M;
    static int[] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        // N배열 생성 및 초기화
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // N 카드 오름차순 정렬
        Arrays.sort(arr);

        // M 값 초기화 및 이진탐색 진행
        M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<M; i++) {
            int now = Integer.parseInt(st.nextToken());

            // 이진탐색 호출
            if(binarySearch(now)) bw.write("1 ");
            else bw.write("0 ");

        }//for

        // binarySearch 메서드 값 출력
        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean binarySearch(int now) {
        int leftIndex = 0;
        int rigthIndex = N-1;



        while(leftIndex <= rigthIndex) {
            int midIndex = (leftIndex + rigthIndex) / 2;
            
            if(now > arr[midIndex]) {
                leftIndex = midIndex +1;
            }
            else if (now < arr[midIndex]) {
                rigthIndex = midIndex -1;
            }
            else return true;

        }

        return false;
    }


}