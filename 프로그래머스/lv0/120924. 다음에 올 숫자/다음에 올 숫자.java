class Solution {
    public int solution(int[] common) {
        int a = common[2];
        int b = common[1];
        int c = common[0];
        if(a-b == b-c){
            // 등차수열이므로
            return common[common.length-1] + (a-b);
        }else{
            // 등비수열이므로
            return common[common.length-1] * (a/b);
        }
    }
}