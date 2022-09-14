import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        int i, j;
        
        Scanner sc = new Scanner(System.in);
        
        j = sc.nextInt();
        
        for(i=1; i<=9;i++) {
            int c = j*i;
            System.out.println(j + " * " + i + " = " + c);
        }
    }
}