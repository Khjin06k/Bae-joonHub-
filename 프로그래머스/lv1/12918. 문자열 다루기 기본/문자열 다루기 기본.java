class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(!(s.length()==4 || s.length() == 6)){
            return false;
        }else{
            for(int i = 0; i<s.length(); i++){
                if(s.charAt(i)>=65) return false;
            }
        }
        return answer;
    }
}