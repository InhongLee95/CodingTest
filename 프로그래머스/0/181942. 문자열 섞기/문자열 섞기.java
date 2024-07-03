class Solution {
    public String solution(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        
        // 두 문자열의 길이는 같다고 가정합니다.
        int length = str1.length();
        
        for (int i = 0; i < length; i++) {
            sb.append(str1.charAt(i));
            sb.append(str2.charAt(i));
        }
        
        return sb.toString();
    }
}