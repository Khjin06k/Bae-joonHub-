import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr;
        int C = sc.nextInt();

        for(int i=0; i<C; i++) {
            int N = sc.nextInt();
            arr = new int[N];
            double sum = 0;
            for (int j = 0; j < N; j++) { //평균을 위해 값을 다 더함
                arr[j] = sc.nextInt();
                sum += arr[j];
            }
            double result = sum /N; //평균 구하기
            double count=0;
            for (int j = 0; j < N; j++) {
                if (arr[j] > result) count++;
            }
            System.out.printf("%.3f%%\n", count/N*100);
        }
        sc.close();
    }

}
