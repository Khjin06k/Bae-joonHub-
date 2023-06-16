class Solution {
    public String solution(String my_string) {
        String[] a = my_string.split("");
        String answer = "";
        for(int j = 0; j<a.length; j++){
            if(a[j].equals("a")||a[j].equals("e")||a[j].equals("i")||a[j].equals("o")||a[j].equals("u")) continue;
            answer += a[j];
        }
        
        return answer;
    }
}