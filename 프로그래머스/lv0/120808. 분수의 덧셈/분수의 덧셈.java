class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        answer[0] = numer1*denom2 + numer2*denom1;
        answer[1] = denom1*denom2;
        for(int i = 2; i<=answer[0]; i++){
            sol(answer, i);
            if(answer[0] == 1) break;
        }
        return answer;
    }
    public int[] sol(int[] arr, int n){
        if(arr[0]%n==0 && arr[1]%n==0){
            while(true){
                if(arr[0]%n !=0 || arr[1]%n!=0) break;
                arr[0] = arr[0]/n;
                arr[1] = arr[1]/n;
            }
                
        }
        return arr;
    }
}