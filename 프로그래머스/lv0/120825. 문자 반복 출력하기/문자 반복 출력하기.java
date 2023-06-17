class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] s = my_string.split("");
        
        for(int i = 0; i<s.length; i++){
            int j = 0;
            while(j<n){
                answer += s[i];
                j++;
            }
        }
        return answer;
    }
}