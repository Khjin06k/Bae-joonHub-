class Solution {
    public String solution(String myString) {
        String[] string = myString.split("");
        String answer = "";
        for(int i = 0; i<string.length; i++){
            if(string[i].equals("a") || string[i].equals("A")) answer += string[i].toUpperCase();
            else answer += string[i].toLowerCase();
        }
        return answer;
    }
}