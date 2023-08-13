class Solution {
    public int solution(int balls, int share) {
        double a = factorial1(balls, share, balls-share+1);
        double b = factorial(share);
        return (int)(a/b);
    }
    
    public double factorial(int a){
        if(a==1) return (double)a;
        else return (double)a*(double)factorial(a-1);
    }
    
    public double factorial1(int a, int b, int c){
        if(a==c) return (double)a;
        else return (double)a*(double)factorial1(a-1, b, c);
    }
}