class Solution {
    public String solution(String my_string, int s, int e) {
 
        
        char[] charArray = my_string.toCharArray();
        
        // 인덱스 s부터 e까지의 부분을 뒤집음
        for (int i = s, j = e; i < j; i++, j--) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }
        
        // 뒤집은 char 배열을 다시 문자열로 변환하여 반환
        return new String(charArray);
    }
}
