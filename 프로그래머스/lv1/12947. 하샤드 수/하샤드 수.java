class Solution {
    public boolean solution(int x) {
        String s = x+"";
        int h = 0;
        for(int i = 0; i<s.length(); i++){
            h += Character.getNumericValue(s.charAt(i));
        }
        if(x%h == 0) return true;
        else return false;
       
    }
}