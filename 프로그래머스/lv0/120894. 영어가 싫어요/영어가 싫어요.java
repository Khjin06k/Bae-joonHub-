import java.util.*;
class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String[] number = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        String str = "";
        String str1 = "";
        for(int i = 0; i<numbers.length(); i++){
            str += numbers.charAt(i);
            if(Arrays.asList(number).contains(str)){
                str1 += Arrays.asList(number).indexOf(str);
                str = "";
            }
        }
        return Long.parseLong(str1);
    }
}