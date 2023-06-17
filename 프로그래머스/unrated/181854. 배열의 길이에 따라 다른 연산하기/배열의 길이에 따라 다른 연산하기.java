class Solution {
    public int[] solution(int[] arr, int n) {
        
        if(arr.length %2 == 0){
            for(int i = 1; i*2<=arr.length; i++){
                arr[i*2-1] += n;
            }
        }else{
            for(int i = 0; i*2<arr.length; i++)
                arr[i*2] += n;
            
        }
        return arr;
    }
    
    
        
}
