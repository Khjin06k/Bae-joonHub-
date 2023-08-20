import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 2; i<=n; i++){
            // i로 나눴을 때 나머지가 0이라면 인수가 될 수 있음
            if(n%i==0){
                list.add(i); // 인수는 리스트에 저장
                // i로 나눠지지 않을때까지 n을 i로 나눔
                while(true){
                    if(n%i!=0){
                       break; 
                    } 
                    n = n/i;
                }
            }
            if(n == 1) break;
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}