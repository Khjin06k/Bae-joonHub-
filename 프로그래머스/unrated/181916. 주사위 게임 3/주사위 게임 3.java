import java.lang.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        // 네 주사위 숫자가 모두 동일할 경우
        if(a==b && b==c && c==d){
            answer = 1111*a;
        // 세 주사위 숫자가 같고 1개만 다른 경우
        }else if(a==b && b==c){
            answer = (int)Math.pow(10*a+d, 2);
        }else if(a==b && b==d){
            answer = (int)Math.pow(10*a+c, 2);
        }else if(a==c&& c==d){
            answer = (int)Math.pow(10*a+b, 2);
        }else if(b==c && c==d){
            answer = (int)Math.pow(10*b+a, 2);
        // 주사위 숫자가 2개로 나뉜 경우
        }else if(a==b && c==d){
            answer = (a+c)*Math.abs(a-c);
        }else if(a==c && b==d || a==d && b==c){
            answer = (a+b)*Math.abs(a-b);
        // 두 주사위 숫자가 같고 나머지 두 주사위가 다른 경우
        }else if(a==b){
            answer = c*d;
        }else if(a==c){
            answer = b*d;
        }else if(a==d){
            answer = b*c;
        }else if(b==c){
            answer = a*d;
        }else if(b==d){
            answer = a*c;
        }else if(c==d){
            answer = a*b;
        // 모든 주사위의 숫자가 다른 경우
        }else{
            answer = Math.min(Math.min(Math.min(a,b),c),d);
        }
        return answer;
    }
}