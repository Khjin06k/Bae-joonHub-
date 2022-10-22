import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
		int up = Integer.parseInt(st.nextToken());
		int down = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
        
        int count = (h-down)/(up-down);
        //기본적으로 h/a의 몫이 되겠지만 도달한 후 미끄러지지 않기 때문에 h에서 down만큼 미리 감소시킨 값에서 나눠줘야 함.
        if((h-down)%(up-down)!=0) count++;
        
        System.out.println(count);   //버퍼에 있는 값 전부 출력
        
    }
}