class Solution {
    public int solution(int a, int b) {
        String a1 = a+"";
        String b1 = b+"";
        
        int answer1 = Integer.parseInt(a1+b1);
        int answer2 = Integer.parseInt(b1+a1);
    
        if(answer1 > answer2) return answer1;
        else return answer2;
        
    }
}