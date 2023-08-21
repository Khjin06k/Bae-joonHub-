import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        int answer = 1;
        int max = 0;
        int[] list = new int[strArr.length];
        for(int i = 0; i<list.length; i++){
            list[i] = strArr[i].length();
        }
        Arrays.sort(list); // 배열 정렬
        for(int i = 1; i<list.length; i++){
            if(list[i] != list[i-1]) {
                if(max<answer){
                    max = answer;
                } 
                answer = 1;
            }else answer+=1;
        }
        
        if(max<answer) max = answer;
        return max;
        
    }
}