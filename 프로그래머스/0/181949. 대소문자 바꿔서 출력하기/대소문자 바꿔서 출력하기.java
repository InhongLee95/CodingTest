import java.util.Scanner;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        char[] count = a.toCharArray();
        
        for(int i = 0; i < count.length; i ++) {
            if(Character.isUpperCase(count[i])) {
                count[i] = Character.toLowerCase(count[i]);
            } else{
                count[i] = Character.toUpperCase(count[i]);
            }
        } //for
        
        String answer = new String(count);
        System.out.print(answer);
        
    }
}