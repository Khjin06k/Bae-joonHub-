class Solution {
    public int solution(String myString, String pat) {
        String str = "";
        String[] answer = myString.split("");
        for(int i = 0; i<myString.length(); i++){
            if(answer[i].equals("A")) str += "B";
            else str += "A";
        }
        if(str.contains(pat)) return 1;
        else return 0;
    }
}