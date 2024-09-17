import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");


        int count = 0;
        ArrayList<String> answer = new ArrayList<>();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> set = new HashSet<>();

        for(int i = 0; i< N; i++) {
            set.add(br.readLine());
        }

        for(int i = 0; i<M; i++) {
            String tmp = br.readLine();

            if(set.contains(tmp)) {
                count++;
                answer.add(tmp);
            }

        }


        Collections.sort(answer);

        System.out.println(count);
        for(int i = 0; i<answer.size(); i++) {
            System.out.println(answer.get(i));
        }



    }


}
