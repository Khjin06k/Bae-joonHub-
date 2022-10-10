import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //결과를 저장할 리스트
        ArrayList<String> result = new ArrayList<String>();
        
        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            //두 숫자가 모두 0이면 종료
            if(a==0 && b == 0) break;
            //둘 다 0인 경우는 위에서 걸리기 때문에 해당 if문에서는 둘 중 하나가 0인 경우만 존재함
            if(a == 0 || b==0){
                result.add("neither");
            }
            if(a<b){
                if(b%a == 0) result.add("factor");
                else result.add("neither");
            }
            else{
                if(a%b == 0) result.add("multiple");
                else result.add("neither");
            }
        }
        for(int i = 0; i<result.size(); i++){
            System.out.println(result.get(i));
        }
    }
}