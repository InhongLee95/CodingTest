import java.io.BufferedInputStream;
import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];


        for (int i=0; i<arr.length; i++) {
            int input =  Integer.parseInt(br.readLine());
            arr[i] = input;
        }

        int maxValue = arr[0];
        int maxElement = 1;

        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];

                maxElement = i +1;
            }


        }

        System.out.println(maxValue);
        System.out.println(maxElement);

    }
}