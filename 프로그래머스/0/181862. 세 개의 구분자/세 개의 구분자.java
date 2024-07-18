import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        List<String> temp = new ArrayList<>();

        myStr = myStr.replace("a", " ");
        myStr = myStr.replace("b", " ");
        myStr = myStr.replace("c", " ");
        
        String[] list = myStr.split(" ");
        
        for (String str : list) {
            if (!str.isEmpty()) {
                temp.add(str);
            }
        }
        
        
        
        
        if (temp.isEmpty()) {
            return new String[]{"EMPTY"};
        } else {
            return temp.toArray(new String[temp.size()]);
        }


        
        
        
    }
}
