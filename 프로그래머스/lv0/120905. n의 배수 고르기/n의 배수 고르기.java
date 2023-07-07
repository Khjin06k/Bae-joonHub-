import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] answer = {};
        int j = 0;
        for(int i = 0; i<numlist.length; i++){
            if(numlist[i] % n == 0){
                list.add(numlist[i]);
            } 
        }
        answer = new int[list.size()];
        for(int i = 0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}