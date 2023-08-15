class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        for(int i = 0; i<A.length(); i++){
            if(A.equals(B)) return answer;
            else{
                B = (B.substring(1, B.length())+B.charAt(0));
                answer++;
            }
        }
        if(answer == A.length()) return -1;
        return answer;
    }
}