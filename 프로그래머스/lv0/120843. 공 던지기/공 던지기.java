class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int idx = 0;
        while(true){
            answer+=1;
            if(answer == k) break;
            idx+=2;
            if(idx>=numbers.length){
                idx %= numbers.length;
            }
        }
        return numbers[idx];
    }
}