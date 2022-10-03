import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt(); //숫자를 입력받음
        //i를 1씩 늘려가면서 나누고 나눈 숫자가 6보다 작을 경우에는 반복을 멈추고 만약 아닐 경우 계속 나눔
        if(num == 1) System.out.println(1);
        else{
         /*int i = 2;
         while(num>=6){
             i++;
             num = num/i;
         }
         System.out.println(i);*/
          int range = 1;
            int i = 1;
            while(range < num){
                range = range + (6*i);
                i++;
            }
            System.out.println(i);
        }
    }
}