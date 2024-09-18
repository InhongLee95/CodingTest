import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");


        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        int answer = 0;
        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i< N; i++) {
            arr1.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i< N; i++) {
            arr2.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(arr1);
        
        // B리스트를 오름차순 정렬 후 reverse로 뒤집는다.
        Collections.sort(arr2);
        Collections.reverse(arr2);

        int tmp =0;

        for(int i = 0; i<arr1.size(); i++) {
            answer += arr1.get(i) * arr2.get(i);

        }

        System.out.println(answer);
    }


}
