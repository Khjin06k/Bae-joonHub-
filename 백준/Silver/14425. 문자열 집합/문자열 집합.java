import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        //집합 S
        String[] str1 = new String[num1];
        for(int i = 0; i<num1; i++){
            str1[i] = sc.next();
        }
        //검사할 문자열
        String[] str2 = new String[num2];
        for(int i = 0; i<num2; i++){
            str2[i] = sc.next();
        }
        
        //검사할 문자열의 요소들이 집합 S에 몇개 포함되어 있는지 count 값 출력
        int count = 0;
        for(int i = 0; i<num2; i++){
            String tmp = str2[i];
            if(Arrays.asList(str1).contains(tmp)) count++;
        }
        System.out.println(count);
    }
        
}