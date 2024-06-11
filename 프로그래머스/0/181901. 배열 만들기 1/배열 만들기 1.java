import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int n, int k) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=1; i<=n; i++) {
            if(i % k == 0) {
                temp.add(i);
            }
        }
        
        
        return temp;
    }
}