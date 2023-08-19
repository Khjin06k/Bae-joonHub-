import java.util.*;
class Solution {
    public String[] solution(String myString) {
        if(myString.charAt(0)=='x') myString = myString.substring(1, myString.length());
        // x문자 앞에 문자가 하나 이상인 경우와 x로 끝나는 경우로 구분
        String[] answer = myString.split("[x]+|[x]$");
        Arrays.sort(answer);
        return answer;
    }
}