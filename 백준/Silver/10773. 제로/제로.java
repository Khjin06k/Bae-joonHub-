import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        Stack<Integer> stack = new Stack<Integer>();
        
        int num = sc.nextInt();
        for(int i= 0; i<num; i++){
            int add = sc.nextInt();
            if(add == 0){
                stack.pop();
            } else{
                stack.push(add);
            }
        }
        int result = 0;
        while(!stack.empty()){
            result += stack.pop();
        }
        System.out.println(result);
    }
}