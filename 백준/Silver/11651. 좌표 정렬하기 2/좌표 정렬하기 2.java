import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        //입력받은 좌표 저장
        int[][] xy = new int[num][2];
        for(int i=0; i<num; i++){
            xy[i][0] = sc.nextInt();
            xy[i][1] = sc.nextInt();
        }
        //배열 정렬하기
        Arrays.sort(xy, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2){
                if(o1[1] == o2[1]){
                    return o1[0]-o2[0];
                }else return o1[1] - o2[1];
            }
        });
        
        for(int i = 0; i<xy.length; i++){
            System.out.println(xy[i][0] + " " + xy[i][1]);
        }
    }
}