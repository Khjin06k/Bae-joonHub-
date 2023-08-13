import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        
        for(int j = 0; j<arr.length; j++){
            if(list.isEmpty()){
                list.add(arr[j]);
                i +=1;
            }else if(list.get(list.size()-1) < arr[j]){
                list.add(arr[j]);
                i+=1;
            }else{
                list.remove(list.size()-1);
                j--;
            }
        }
        
        int[] stk = new int[list.size()];
        for(int j = 0; j<list.size(); j++){
            stk[j] = list.get(j);
        }
        
        return stk;
    }
}