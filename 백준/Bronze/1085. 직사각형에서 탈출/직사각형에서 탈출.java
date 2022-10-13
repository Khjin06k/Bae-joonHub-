import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //x,y,w,h 순으로 입력받기
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        
        int min = 0;
        //x,y는 직사각형 내에 존재하는 점
        if(x>w-x){
            min = w-x;
        }else{
            min = x;
        }
        
        if(y>h-y){
            if(min>h-y)min = h-y;
        }else{
            if(min>y) min = y;
        }
        
        System.out.println(min);
    }
}