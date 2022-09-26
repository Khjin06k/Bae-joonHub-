import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException; 
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // 버퍼 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(bf.readLine()); //입력받을 배열 크기
        int[] arr = new int[num];
        for(int i = 0; i<num; i++){//배열 요소 입력
            arr[i] = Integer.parseInt(bf.readLine());
        }
        
        Arrays.sort(arr);
        for(int i = 0; i<num; i++){
            bw.write(arr[i]+"\n");
        }
        bw.flush();   //남아있는 데이터를 모두 출력시킴
        bw.close();   //스트림을 닫음
    }
}