class Solution {
    public String solution(String rsp) {
        String[] str= rsp.split("");
        String answer = "";
        for(String s : str){
            if(s.equals("0")) answer += "5";
            else if(s.equals("2")) answer += "0";
            else answer += "2";
        }
        return answer;
    }
}