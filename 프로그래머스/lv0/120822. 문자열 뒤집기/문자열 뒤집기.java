class Solution {
    public String solution(String my_string) {
        String[] a = my_string.split("");
        String answer = "";
        for(int i = a.length-1; i>=0; i--){
            answer += a[i];
        }
        return answer;
    }
}