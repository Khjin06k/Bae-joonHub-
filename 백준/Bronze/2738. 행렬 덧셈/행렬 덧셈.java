import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        //a, b 행렬 입력 받기
        int[][] a = new int[n][m];
        int[][] b = new int[n][m];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                b[i][j] = sc.nextInt();
            }
        }
        
        int[][] result = new int[n][m];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                result[i][j] = a[i][j]+b[i][j];
                 System.out.print(result[i][j]+" ");
            }
            System.out.println(""); 
        }
        
    }
}