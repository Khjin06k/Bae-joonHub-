import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int j = 0;
        for(int i = 0; i<arr.length; i++){
            // stk가 빈 배열이라면
            if(list.isEmpty()){
                list.add(arr[i]);
                j++;
            // stk에 원소가 있고, 마지막 원소가 arr[i]와 같을 경우
            }else if(!list.isEmpty() && (list.get(list.size()-1) == arr[i])){
                list.remove(list.size()-1);
                j++;
            }else{
                list.add(arr[i]);
                j++;
            }
        }
        
        int[] answer = {};
        
        if(list.size() == 0){
            answer = new int[1];
            answer[0] = -1;
        }else{
            answer = new int[list.size()];
            for(int i = 0; i<list.size(); i++){
                answer[i] = list.get(i);
            }
        }
        
        return answer;
    }
}