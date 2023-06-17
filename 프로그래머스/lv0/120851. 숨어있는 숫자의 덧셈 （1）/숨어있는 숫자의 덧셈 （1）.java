import java.util.*;

class Solution {
    public int solution(String my_string) {
        String[] s = my_string.split("");
        int answer = 0;
        for(int i = 0; i<s.length; i++){
            try{
                answer += Integer.parseInt(s[i]);
            } catch(NumberFormatException ex){
                continue;
            }
        }
        return answer;
    }
}