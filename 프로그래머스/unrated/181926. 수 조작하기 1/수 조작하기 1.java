class Solution {
    public int solution(int n, String control) {
        String[] a = control.split("");
        for(int i = 0; i<a.length; i++){
          if(a[i].equals("w")) n += 1;
            else if(a[i].equals("s")) n -= 1;
            else if(a[i].equals("d")) n += 10;
            else n -= 10;
        }
        return n;
    }
}