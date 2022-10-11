import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int count = sc.nextInt(); //약수의 개수 입력
        int[] num = new int[count]; //양수의 약수중 1과 자기자신을 제외한 약수를 입력
        for(int i = 0; i<count; i++){
            num[i] = sc.nextInt();
        }
        //1과 자기자신을 제외한 약수일 경우 해당 약수들을 오름차순 정렬했을 때 처음과 마지막 수의 곱이 원래의 수가 됨
        Arrays.sort(num);
        System.out.println(num[0]*num[count-1]);
    }
}