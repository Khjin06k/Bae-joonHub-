class Solution {
    public String solution(String s) {
        String[] answer = s.split("");
        String answer1 ="";
        int count = 0;
        for(int i=0; i<answer.length; i++){
            if(answer[i].equals(" ")){
                count = 0;
                answer1 += answer[i];
            } else{
                if(count%2==0){
                    answer1 += answer[i].toUpperCase();
                } else{
                    answer1 += answer[i].toLowerCase();
                } 
                count++;
            }
        }
        return answer1;
    }
}