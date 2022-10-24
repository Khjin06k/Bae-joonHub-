import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int count = sc.nextInt(); //입력받을 숫자 갯수
        
        int[] arr = new int[count];
        for(int i = 0; i<count; i++){
            arr[i] = sc.nextInt(); //배열에 숫자 하나씩 입력 받기
        }
        
        int com = sc.nextInt(); //비교할 숫자 입력받기
        
        //비교해서 같은 숫자일 경우 result++
        int result = 0;
        for(int i = 0; i<count; i++){
            if(arr[i] == com) result++;
        }
        System.out.println(result);
        
    }
}