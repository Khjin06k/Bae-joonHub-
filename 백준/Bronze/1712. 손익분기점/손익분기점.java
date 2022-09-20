import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        /*고정비용+가변비용*생산수<=판매가*생산수
        생산수(판매가-가변비용) = 고정비용
        생산수 = 고정비용/(판매가-가변비용)
        >> N을 기점으로 손익분기점이 바뀜
         */
        if(b>=c) System.out.println(-1);
        else {
            System.out.println(a/(c-b)+1);
            //따라서 손익분기점이 바뀌는 시점을 출력하는 것이므로 N+1인 a/(c-b)+1가 되어야 함
        }
    }
}
