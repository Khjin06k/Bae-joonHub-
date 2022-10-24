import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //기본은 0으로 초기화, 제출한 학생들의 값을 모두 1로 변경함.
        int[] student = new int[31];
        for(int i = 1; i<=28; i++){
            int num = sc.nextInt();
            student[num] = 1;
        }
        
        //제출하지 않은 학생들은 값이 0이므로 0인 학생들을 모두 출력
        for(int i = 1; i<31; i++){
            if(student[i] == 0) System.out.println(i);
        }
        
    }
}