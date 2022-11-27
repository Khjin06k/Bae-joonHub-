import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt(); //색종이 개수 입력 받기
        
        int[][] colorPaper = new int[num][2];
        for(int i = 0; i<num; i++){//색종이 시작점 입력 받아서 배열에 저장하기
            colorPaper[i][0] = sc.nextInt();
            colorPaper[i][1] = sc.nextInt();
        }
        
        int[][] check = new int[100][100]; //흰색 도화지
        int count = 1;
        //입력받은 색종이들을 하나씩 흰색 도화지 영역에 표시함.
        for(int i = 0; i<num; i++){
            int plusx = 0;
            int x = colorPaper[i][0];

            while(plusx<10){
                int plusy = 0;
                int y = colorPaper[i][1];
                while(plusy<10){
                    check[x][y] += count;
                    y++;
                    plusy++;
                }
                x++;
                plusx++;
            }
            count++;
        }
        
        int result = 0;
        for(int i = 0; i<100; i++){
            for(int j = 0; j<100; j++){
                if(check[i][j] != 0) result++;
            }
        }
        
        System.out.println(result);
    }
}