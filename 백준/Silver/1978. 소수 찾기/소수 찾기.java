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
            while(j<=Math.sqrt(num1)){
                if(num1%j==0){
                    check = false;
                }
                j++;
            }
            if(check) count++;
        }
        System.out.println(count);
    }
}