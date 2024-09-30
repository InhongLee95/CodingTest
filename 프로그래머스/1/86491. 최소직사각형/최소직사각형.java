import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxLow=0;
        int maxCol=0;
        
        
        for(int i=0;i<sizes.length;i++){
            int low = Math.max(sizes[i][0], sizes[i][1]);
            int col = Math.min(sizes[i][0], sizes[i][1]);
            
            if(maxLow < low) maxLow = low;
            if(maxCol < col) maxCol = col;
            
        }
        
        
        return answer=maxLow*maxCol;
    }
}
