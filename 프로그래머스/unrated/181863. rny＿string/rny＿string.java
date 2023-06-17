class Solution {
    public String solution(String rny_string) {
        String[] answer = rny_string.split("");
        String str = "";
        for(int i = 0; i<rny_string.length(); i++){
            if(answer[i].equals("m")) str += "rn";
            else str += answer[i];
        }
        return str;
    }
}