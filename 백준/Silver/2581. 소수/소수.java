import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //시작 숫자부터 마지막 숫자까지 입력 받은 후 소수 거르기
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
     
        int sum = 0;
        int min = num2;
        //소수 판별하기
        for(int i = num1; i<=num2; i++){
            boolean check = true;
            if(i == 1) check = false;
            for(int j=2; j<i; j++){
                if(i%j==0){
                    check = false;
                    break;
                }
            }
            if(check){
                sum += i; //소수일 경우 list에 저장하기
                if(min>i) min = i;
            }
        }
        if(sum == 0) System.out.println(-1);
        else{
            System.out.println(sum);
            System.out.println(min); //차례대로 add 하기 때문에 맨 처음이 최저값이다.
        }
        sc.close();
    }
}