import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            if(a == 0 && b == 0 && c==0) break;
            else System.out.println(triangle(a,b,c));
  
        }
    }
    
    //직각삼각형인지 판별하기
    public static String triangle(int a, int b, int c){
        //최댓값 찾기 (최댓값이 빗변의 길이가 되어야 함)
        int max = a;
        if(max<b) max = b;
        if(max<c) max = c;
        
        if(max == a){
            if(a*a == b*b+c*c) return "right";
            else return "wrong";
        } else if(max == b){
            if(b*b == a*a+c*c) return "right";
            else return "wrong";
        } else{
            if(c*c == b*b+a*a) return "right";
            else return "wrong";
        }
    }
}