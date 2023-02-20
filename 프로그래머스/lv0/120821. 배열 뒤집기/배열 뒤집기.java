class Solution {
    public int[] solution(int[] num_list) {
        int left = 0;
        int right = num_list.length-1;
        for(int i = left; i<num_list.length/2; i++){
            int temp = num_list[i];
            num_list[i] = num_list[right];
            num_list[right] = temp;
            right--;
        }
        return num_list;
    }
}