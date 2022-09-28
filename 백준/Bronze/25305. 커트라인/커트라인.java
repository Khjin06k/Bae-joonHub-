import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt(); //입력받을 배열 크기
        int cut = sc.nextInt(); // 커트라인
        int[] arr = new int[num];
        for(int i = 0; i<num; i++){//배열 요소 입력
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        System.out.println(arr[num-cut]);
        
    }
}