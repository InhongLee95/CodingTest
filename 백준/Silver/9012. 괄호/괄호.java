import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i<n; i++) {
            Stack<Character> stack = new Stack<>();
            char[] arr = br.readLine().toCharArray();

            for(int j = 0; j<arr.length; j++) {
                if(arr[j] =='(') {
                    stack.push(arr[j]);
                }
                else {
                    if(stack.isEmpty()) {
                        stack.push(arr[j]);
                        break;
                    }
                    else {
                        stack.pop();
                    }
                }



            }//inner - for
            if(stack.isEmpty()) System.out.println("YES");
            else System.out.println("NO");

        }//for



    }//main

}
