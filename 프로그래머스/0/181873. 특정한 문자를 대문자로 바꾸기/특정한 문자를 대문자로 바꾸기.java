class Solution {
    public String solution(String my_string, String alp) {
        
        // 주어진 문자열 'alp'를 대문자로 변환한 문자열로 교체
        my_string = my_string.replace(alp, alp.toUpperCase());
        return my_string;
    }
}
