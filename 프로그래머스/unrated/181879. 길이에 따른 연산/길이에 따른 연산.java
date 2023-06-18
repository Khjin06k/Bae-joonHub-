class Solution {
    public int solution(int[] num_list) {
        int answer;
        if(num_list.length >=11){
            answer = 0;
            for(int s : num_list) answer += s;
        }else{
            answer = 1;
            for(int s : num_list) answer *= s;
        }
        return answer;
    }
}