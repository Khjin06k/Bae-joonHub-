class Solution {
    boolean solution(String s) {
        s = s.toUpperCase();
        int a = 0;
        int b = 0;
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i)==('P')) a++;
            else if(s.charAt(i)==('Y')) b++;
        }
        if(a==b) return true;
        else return false;

    }
}