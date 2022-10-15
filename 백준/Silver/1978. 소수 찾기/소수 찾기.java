import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt(); //입력받을 숫자 개수 입력받기
        
        int count = 0;
        
        for(int i = 0; i<num; i++){//num개 숫자 입력받아서 소수인지 판단 후 소수일 경우 count++
            int num1 = sc.nextInt();
            boolean check = true;
            
            if(num1 == 1) continue;
            int j = 2;
            while(j<= Math.sqrt(num1)){
                if(num1%j==0){
                    check = false;
                    break;
                }
                j++;
            }
            if(check) count++;
            //while문이 정상적으로 끝나는 것이 아닌 break문을 사용해 끝나게 될 경우에도 count++을 실행하기 때문에 해당 부분을 판단할 boolean이 필요했던 것
        }
        System.out.println(count);
    }
}