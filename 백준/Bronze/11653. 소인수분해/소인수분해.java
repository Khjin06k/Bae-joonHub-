import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //소인수분해는 2부터 나누기 시작
        int i = 2;
        //소인수분해 할 숫자 입력받기
        int num = sc.nextInt();
        
        while(num>=i){
            if(num%i==0) {
                num /=i; //만약 i로 나눠진다면 i로 나누기 >> 나눠지지 않을때까지 계속 나눠짐
                System.out.println(i); //나눈 후 i 출력
            }
            else i++; //나눠지지 않을 경우 i값 증가
        }
        
    }
}