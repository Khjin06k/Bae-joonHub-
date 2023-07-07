class Solution {
    public String[] solution(String[] names) {
        int length = 0;
        if(names.length%5==0) length = names.length/5;
        else length = names.length/5+1;
        
        String[] answer = new String[length];
        int i = 0;
        int j = 0;
        while(i < names.length){
            answer[j] = names[i];
            j++;
            i+=5;
        }
        return answer;
    }
}