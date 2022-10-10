import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] xy = new int[3][2];
        
        for(int i = 0; i<3; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            xy[i][0] = a;
            xy[i][1] = b;
        }
        
       int x = xy[0][0];
       int y = xy[0][1];
        
       if(x == xy[1][0]){
           x = xy[2][0];
       } 
       else if(x == xy[2][0]){
           x = xy[1][0];
       } 
       else {
           x = x;
       }
       
       if(y == xy[1][1]){
           y = xy[2][1];
       } 
       else if(y == xy[2][1]){
           y = xy[1][1];
       } 
       else {
           y = y;
       }
        
       System.out.println(x + " " + y);
    }
}