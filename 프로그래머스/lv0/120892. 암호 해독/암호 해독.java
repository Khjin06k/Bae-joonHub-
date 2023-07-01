class Solution {
    public String solution(String cipher, int code) {
        String[] str = cipher.split("");
        String answer = "";
        int i = code-1;
        while(i<cipher.length()){
            answer += str[i];
            i += code;
        }
        return answer;
    }
}