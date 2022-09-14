import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       
        int A, B, C;
        Scanner sc = new Scanner(System.in);
        
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        
        int D=0;
        
        if(A==B && B==C) {
            D = 10000+A*1000;
        } else if(A==B || B==C) {
            D = 1000+B*100;
        } else if(A==C){
            D = 1000+A*100;
        } else {
            if(A<B){
                if(B<C){
                    D = C*100;
                } else {
                    D = B*100;
                }
            } else if(A>B){
                if(A>C){
                    D = A*100;
                } else {
                    D = C*100;
                }
            }
        }
        
        System.out.println(D);
    }
}