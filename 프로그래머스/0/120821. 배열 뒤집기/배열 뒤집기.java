import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        
        int[] copy = new int[num_list.length];
        
    for (int i = num_list.length - 1, j = 0; i >= 0; i--, j++) {
        copy[j] = num_list[i];
    }
        
        
        
        return copy;
    }
}