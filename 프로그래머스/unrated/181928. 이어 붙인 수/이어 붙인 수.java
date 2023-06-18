class Solution {
    public int solution(int[] num_list) {
        String answer1 = "";
        String answer2 = "";
        for(int i = 0; i<num_list.length; i++){
            if(num_list[i]%2==1){
                answer1 += num_list[i];
            }else{
                answer2 += num_list[i];
            }
        }
        return Integer.parseInt(answer1) + Integer.parseInt(answer2);
    }
}