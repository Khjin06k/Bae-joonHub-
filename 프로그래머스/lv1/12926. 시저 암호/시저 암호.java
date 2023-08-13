class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == ' ') answer += " ";
            else{
                // 소문자인 경우
                if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z' && s.charAt(i) +n > 'z') answer += (char)(s.charAt(i) + n - 26);
                else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' && s.charAt(i)+n > 'Z' )
                    answer += (char)(s.charAt(i) + n - 26);
                else answer += (char)(s.charAt(i)+n);
            }
        }
        return answer;
    }
}