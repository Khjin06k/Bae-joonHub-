class Solution {
    public int solution(int n) {
        long answer = 0;
        while(n!=0){
            answer *= 10;
            answer += n%3;
            n = n/3;
        }
        // answer 은 3진법을 앞뒤 반전한 숫자가 됨.
        long answer1= 0;
        long count = 1;
        while(answer != 0){
            answer1 += (answer%10)*count;
            answer = answer/10;
            count *= 3;
        }
        return (int)answer1;
    }
}