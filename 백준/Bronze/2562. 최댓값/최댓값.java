import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[9];
        
        for(int i = 0; i<9; i++){
            int a = sc.nextInt();
            arr[i] = a;
        }
        
        int Max=arr[0];
        int j = 1;
        
        for(int i = 1; i<9; i++){
            if(arr[i]>Max){
                Max = arr[i];
                j = i+1;
            }
        }
        System.out.println(Max);
        System.out.println(j);
        
    }
}