import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int check = sc.nextInt(); //몇개의 합을 구할것인지
        
        int[] arr = new int[num];
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        for(int i = 0; i<num; i++){ //숫자를 num개 입력받아 배열에 저장
            arr[i] = sc.nextInt();
        }
        for(int i =0; i<num-check+1; i++){
            int sum = 0;
            for(int j = i; j<i+check; j++){
                sum += arr[j];
            }
            result.add(sum);
        }
        Collections.sort(result);
        System.out.println(result.get(result.size()-1));
    }
}