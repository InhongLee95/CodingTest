import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] answer = new String[n];

        for (int i = 0; i<n; i++) {
            String str = br.readLine();

            Stack<Character> stack = new Stack<>();

                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == '(') stack.push(str.charAt(j));
                    else {
                        if (stack.isEmpty()) {
                            stack.push(str.charAt(j));
                            break;
                        }
                        else stack.pop();
                    }


            }
            if(stack.isEmpty()) answer[i] = "YES";
            else answer[i] = "NO";
        }

        for (String output : answer) {
            System.out.println(output);
        }



    }
}