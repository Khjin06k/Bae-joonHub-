class Solution {
    public String solution(String n_str) {
        String[] str = n_str.split("");
        String answer = "";
        int j = 0;
        for(int i = 0; i<str.length; i++){
            if(str[i].equals("0")) continue;
            else{
                j=i;
                break;
            }
        }
        for(int k = j; k<str.length; k++){
            answer += str[k];
        }
        return answer;
    }
}