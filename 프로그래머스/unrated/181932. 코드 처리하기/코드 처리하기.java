class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        for(int i = 0; i<code.length(); i++){
            // 모드 변경하기
            if(code.charAt(i) == '1'){
                if(mode==1) mode = 0;
                else mode = 1;
            }else{
                // 모드에 따라 ret 만들기
                if(mode == 0){
                    if(code.charAt(i) != '1' && i%2==0) answer += code.charAt(i);
                }else{
                    if(code.charAt(i) != '1' && i%2==1) answer += code.charAt(i);
                }
            }            
        }
        if(answer == "") return "EMPTY";
        
        return answer;
    }
}