class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i<=right; i++){
            if(sol(i)) answer +=i;
            else answer -= i;
        }
        return answer;
    }
    
    // 약수 개수 구하기
    boolean sol(int num){
        int count = 1;
        for(int i = 1; i<num; i++){
            if(num %i == 0) count++;
        }
        if(count %2==0) return true;
        return false;
    }
}