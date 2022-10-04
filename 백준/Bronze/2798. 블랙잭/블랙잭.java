import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int limit = sc.nextInt();
        
        int[] arr = new int[num];
        for(int i = 0; i<num; i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        //임의로 순서 상관없이 3장을 뽑아 더했을 때 limit보다는 작은수 중에서 가장 커야한다.
        for(int i = 0; i<num; i++){
            for(int j = i+1; j<num; j++){
                for(int t = j+1; t<num; t++){
                    int put = arr[i]+arr[j]+arr[t];
                    if(put<=limit) list.add(put);
                }
            }
        }
        Collections.sort(list);
        System.out.println(list.get(list.size()-1));
    }
}