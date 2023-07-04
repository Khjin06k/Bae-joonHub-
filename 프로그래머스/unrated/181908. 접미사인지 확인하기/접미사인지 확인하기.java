import java.util.*;

class Solution{
    public int solution(String my_string, String is_suffix) {
        ArrayList<String> list = new ArrayList<>();
        String answer ="";
        for(int i = 0; i<my_string.length(); i++){
            answer = my_string.substring(i, my_string.length());
            list.add(answer);
        }
        for(int i = 0; i<list.size(); i++){
            if(list.get(i).equals(is_suffix)) return 1;
        }
        return 0;
    }
}