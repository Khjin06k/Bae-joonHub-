import java.util.*;

public class Main{
    static int count;
    static String str;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        for(int i = 0; i<num; i++){
            str = sc.next();
            count = 0;
            System.out.println(recursion(0, str.length()-1) + " " + count);
        }
 
    }
    public static int recursion(int l, int r){
        count++;
        if(l >= r) {
            return 1;
        }
        else if(str.charAt(l) != str.charAt(r)) {
            return 0;
        }
        else {
            return recursion(l+1, r-1);
        }
    }
}