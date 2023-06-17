class Solution {
    public int[] solution(int n) {
        int length = 0;
        if(n%2 == 0) length = n/2;
        else length = n/2+1;
        int[] answer = new int[length];
        int i = 1;
        int j = 0;
        while(i<=n){
            answer[j] = i;
            i +=2;
            j++;
        }
        return answer;
    }
}