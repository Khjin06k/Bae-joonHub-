class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i = 0; i<myString.length(); i++){
            char a = myString.charAt(i);
            char b = 'l';
            if((int)a < (int)b) answer += "l";
            else answer += String.valueOf(myString.charAt(i));
        }
        return answer;
    }
}