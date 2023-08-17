class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        // 가장 긴 변의 길이
        int long1 = 0;
        int short1 = 0;
        if(sides[0]>=sides[1]) {
            long1 = sides[0];
            short1 = sides[1];
        }
        else {
            long1 = sides[1];
            short1 = sides[0];
        }
        if(long1==short1) answer++;
        
        // 가장 긴 변이 sides 중에 있는 경우
        int list = 1;
        while(list != long1){
            if(short1+list >= long1) answer++;
            list++;
        }
        // 가장 긴 변이 될 수 있는 경우
        list = long1+1;
        while(short1+long1 > list){
            answer++;
            list++;
        }
        return answer;
    }
}