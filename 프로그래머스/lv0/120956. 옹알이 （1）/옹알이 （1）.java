import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        String[] a = {"aya","ye","woo","ma"};
        int answer = 0;

        for(int i = 0; i<babbling.length; i++){
            String str = "";
            for(int j = 0; j<babbling[i].length(); j++){
                str += babbling[i].charAt(j);
                if(Arrays.asList(a).contains(str)) str = "";
            }
            if(str.equals("")) answer++;
            else continue;
        }
        
        return answer;
    }
}