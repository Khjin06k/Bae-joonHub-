import java.util.*;

class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        //if(total%num==0){
        int answer1 = total/num;
        answer[0] = answer1;
        for(int i = 1; i<answer.length; i++){
            if(i%2==1) answer[i] = answer[i-1]+i;
            else answer[i] = answer[i-1]-i;
         }

        Arrays.sort(answer);
        return answer;
    }
}